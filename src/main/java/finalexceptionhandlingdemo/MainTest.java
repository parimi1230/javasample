package finalexceptionhandlingdemo;//Runtime Polimorphism

class Car{//super class
  public void printRunning(){
   System.out.println("Car is Running");
  }
  public void milege(){
	System.out.println("Car has milege");  
  }
}

class Audi extends Car{ // subclass
 public void printRunning(){
   System.out.println("Audi Car is Running");
 }
 public void milege(){
	System.out.println("Audi Car has 10 KMPL milege");  
  }
}

public class MainTest{
	 public static void main(String args[]){
		Car car = new Audi();//Upcasting
		car.printRunning();
		car.milege();
	 }		 
 }