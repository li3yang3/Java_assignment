

public class Driver {
       String name;
       int licenseNo;
       Double gasamount;
       int age;
       
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
