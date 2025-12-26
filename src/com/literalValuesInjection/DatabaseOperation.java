package com.literalValuesInjection;

public class DatabaseOperation {

      private String url ;
      private String userName ;
     private  String password ;


   public void storeVehicleInDataBase(String vehicleName)
   {
             System.out.println(String.format("database url=%s , userName=%s , password =%s ", url , userName , password));  
             
             System.out.println(String.format("saving %s data", vehicleName));
   }


   public String getUrl() {
    return url;
   }


   public void setUrl(String url) {
    this.url = url;
   }


   public String getUserName() {
    return userName;
   }


   public void setUserName(String userName) {
    this.userName = userName;
   }


   public String getPassword() {
    return password;
   }


   public void setPassword(String password) {
    this.password = password;
   } 

    
}
