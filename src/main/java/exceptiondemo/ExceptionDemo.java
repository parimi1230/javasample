package exceptiondemo;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Calculator calc = new Calculator();
        try{
            System.out.println(calc.add(a, b));
            calc.sub(a, b);
        }catch(CustomException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Inside finally");
        }

    }

}
