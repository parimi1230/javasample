package superdemo;

class A{
   int i=10;
    public void meTest(){
        System.out.println("In Super class");
    }
}

class B extends A{
   int i =20;

   public void meTest(){
       System.out.println("In Sub class");
   }
   public void test(){
       System.out.println(super.i);
       super.meTest();
   }
}

public class SuperVariableLevelDemo {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
