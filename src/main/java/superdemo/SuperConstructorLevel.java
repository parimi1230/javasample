package superdemo;

class A1{
    public A1() {
        System.out.println("Inside A class");
    }

    public A1(int j) {
        System.out.println("Inside A class" + j);
    }
}

class B1 extends A1{
    public B1(){
        super(10);
        System.out.println("Inside B class");
    }
    public B1(int i){
        super(10);
        System.out.println("Inside B class"+ i);
    }

}
public class SuperConstructorLevel {
    public static void main(String[] args) {
        B1 b1 = new B1();
       // B1 b2 = new B1(10);
    }
}
