package com.literalValuesInjection;

public class Car implements Vehicle {

  DatabaseOperation dataBaseOperation;

  public Car(DatabaseOperation dataBaseOperation) {

    this.dataBaseOperation = dataBaseOperation;
  }

  @Override
  public void saveDataToDataBase() {

    dataBaseOperation.storeVehicleInDataBase("plane");

  };

}
