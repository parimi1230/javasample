package finalexceptionhandlingdemo;

class ExceptionHandlingDemo{
 
  public static void main(String args[]){
    int a = 10;
	int b = 0;
	try{
		int c = a/b;		
	}catch(ArithmeticException ex){
	  System.out.println("Divide by zero exception check input variables");		
	}
	
    System.out.println("After Exception");	
  }

}