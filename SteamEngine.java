package com.mycompany.mavenproject2;

public class SteamEngine {
  
  private boolean running;
  private int fuelLevel;
  private SteamFuelType requiredSteamFuelType;
  private SteamFuelType steamFuelType;
  
  public SteamEngine(SteamFuelType requiredSteamFuelType){
    this.requiredSteamFuelType = requiredSteamFuelType;
    running = false;
    fuelLevel = 0;
  }
  
  public void start(){
    if(fuelLevel > 0 && requiredSteamFuelType.equals(this.requiredSteamFuelType)){
      running = true;
    }else{
      throw new IllegalStateException("Not able to start Steam Engine.");
    }
  }
  
  public void stop(){
    running = false;
  }
  
  public boolean isRunning(){
    return running;
  }
  
  public void fill(SteamFuelType steamFuelType, int fuelLevel){
    if(fuelLevel >=0 && fuelLevel <= 100){
      this.fuelLevel = fuelLevel;
    }else if(fuelLevel > 100){
      this.fuelLevel = 100;
    }else{
      this.fuelLevel = 0;
    }
    this.steamFuelType = steamFuelType;
  }
  
  public SteamFuelType getSteamFuelType(){
    return requiredSteamFuelType;
  }
  
}
