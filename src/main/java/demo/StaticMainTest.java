package demo;

public class StaticMainTest {

    static int i;
    static {
        i = 30;
        System.out.println("I am in static block");
    }

    public static void main(String[] args) {

        /*StaticTest test = new StaticTest();
        test.i = 30;
        test.k = 40;
        System.out.println(test.i);

        StaticTest test2 = new StaticTest();
        System.out.println(test2.i);
        System.out.println(test2.k);*/
        System.out.println("Inside main method");
        StaticTest.test();



        System.out.println("Total Objects created is   "+ StaticTest.counter);
    }
}
