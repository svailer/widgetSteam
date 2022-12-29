package com.mycompany.mavenproject2;

public class WidgetMachine {
  
  private InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
  private SteamEngine steamEngine = new SteamEngine(SteamFuelType.WOOD);
  
  public int produceWidgets(int quantity){
    
    engine.fill(FuelType.PETROL, 30);
    
    engine.start();
    int cost = 0;
    
    if(engine.isRunning()){
      cost = produce(quantity);
    }
    engine.stop();
    System.out.println("Internal Combustion Engine cost = "+cost);
    
    return cost;
  }
  
  public double produceSteamWidgets(int quantity){
    
    steamEngine.fill(SteamFuelType.WOOD, 30);
    
    steamEngine.start();
    double cost = 0;
    
    if(steamEngine.isRunning()){
      cost = produceSteam(quantity);
    }
    steamEngine.stop();
    System.out.println("Steam Engine cost = "+cost);
    
    return cost;
  }
  
  private int produce(int quantity){
    int batch = 0;
    int batchCount = 0;
    int costPerBatch = 0;
    
    if(engine.getFuelType() == FuelType.PETROL){
      costPerBatch = 9;
    }else if (engine.getFuelType() == FuelType.DIESEL){
      costPerBatch = 12;
    }
    
    while(batch < quantity){
      batch = batch + 8;
      batchCount++;
    }    
    return batchCount * costPerBatch;            
  }
  
  private double produceSteam(int quantity){
    int batch = 0;
    double batchCount = 0;
    double costPerBatch = 0;
    
    if(steamEngine.getSteamFuelType() == SteamFuelType.WOOD){
      costPerBatch = 4.35;
    }else if (steamEngine.getSteamFuelType() == SteamFuelType.COAL){
      costPerBatch = 5.65;
    }
    
    while(batch < quantity){
      batch = batch + 2;
      batchCount++;
    }    
    return batchCount * costPerBatch;            
  }
  
}
