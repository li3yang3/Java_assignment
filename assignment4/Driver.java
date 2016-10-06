/*
5. Combine with problem 3 and 4, define a class named Driver that contains methods like drive and addGas so that the driver can drive the car.
*/

public class Driver {
       private String name;
       private int licenseNo;
       private Double gasamount;
       private int age;
       
       public Driver(String name,int licenseNo,int age){
    	   this.name = name;
    	   this.licenseNo = licenseNo;
    	   this.age = age;
    	   
       }
       
       public void drive(){
    	   System.out.println("on the road");
       }
       
       public void naviagte(){
    	   System.out.println("navigating to the destination");
       }
       
       public void addGas(Double addvol){
    	   GasTank tank = new GasTank();
    	   tank.addGas(addvol);;
       }
       public void getGasLevel() {
    	   GasTank tank = new GasTank();
    	   tank.getGasLevel();
       }
}
