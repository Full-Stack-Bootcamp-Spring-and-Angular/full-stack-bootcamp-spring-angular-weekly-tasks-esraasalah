package com.literalValuesInjection;

public class Plane  implements Vehicle{


   DatabaseOperation dataBaseOperation ;

    @Override
  public  void saveDataToDataBase()
    {

               dataBaseOperation.storeVehicleInDataBase("plane");

    }

    public DatabaseOperation getDataBaseOperation() {
        return dataBaseOperation;
    }




    public void setDataBaseOperation(DatabaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    } ;
    
}
