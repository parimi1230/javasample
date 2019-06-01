package demo;

class StaticTest {
    int i;
    int j;
    static int k;
    static int counter;

    public StaticTest(){
        counter++;
    }

    public static void test(){
        System.out.println("herere");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}