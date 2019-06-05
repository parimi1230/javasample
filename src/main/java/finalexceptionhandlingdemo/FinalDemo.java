package finalexceptionhandlingdemo;

final class CarFinalDemo{
 //Method level final usage
 /*public final void milege(){
	  System.out.println("Milege");
	}		
	*/
}

class MaruthiFinalDemo extends CarFinalDemo{
	public void milege(){
	  System.out.println("Milege");
	}		
}

class FinalDemo{
 
 public static void main(String args[]){
    //final Variable Demo
	final int i = 10;
	//i=20;
	System.out.println(i);	
 }

}