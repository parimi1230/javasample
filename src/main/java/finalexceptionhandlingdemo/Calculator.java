package finalexceptionhandlingdemo;//Compile time polymorphism

class Calculator{
	
	public int add(int a, int b){
	   return a + b;
	}

	public int add(int a, int b, int c){
	   return a + b + c;
	}
	
	public static void main(String args[]){
	  Calculator calc = new Calculator();
	  int result = calc.add(10, 20);
	  int result2 = calc.add(10, 20, 30);
	  System.out.println(result);
	  System.out.println(result2);
  
	}
}