/*4. Design and implement a class called Car. You need to create necessary attributes for this class, and method if needed
Define the Car constructor to initialize these values (in that order). Include getter and setter methods for all instance data.*/


public class Car {
     String color;
     String brand;
     String model;
     Double weight;
     Double height;
     Double length;
     int productionYear;
     
     public Car(String color,String brand,String model,Double weight,Double height,Double length,int productionYear){
    	 this.color = color;
    	 this.brand = brand;
    	 this.model = model;
    	 this.weight = weight;
    	 this.height = height;
    	 this.length = length;
    	 this.productionYear = productionYear;
     }
     
     public void setColor(String color){
    	 this.color = color;
     }
     public String getColor(){
    	 return color;
     }
     
     public void setBrand(String brand){
    	 this.brand = brand;
     }
     public String getBrand(){
    	 return brand;
     }
     
     public void setModel(String model){
    	 this.model = model;
     }
     public String getModel(){
    	 return model;
     }
     
     public void setWeight(Double weight){
    	 this.weight = weight;
     }
     public Double getWeight(){
    	 return weight;
     }
     
     public void setHeight(Double height){
    	 this.height = height;
     }
     public Double getHeight(){
    	 return height;
     }
     
     public void setLength(Double length){
    	 this.length = length;
     }
     public Double getLength(){
    	 return length;
     }
     
     public void setProYear(int productionYear){
    	 this.productionYear = productionYear;
     }
     
     public int getProYear(){
    	 return productionYear;
     }
     
}
