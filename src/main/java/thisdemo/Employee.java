package thisdemo;

public class Employee {

    String name;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
        getHi();
    }

    private String getHi(){
        return "Hi";
    }
}

class MainTest{

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Test");
        emp.setCity("Hyderabad");
        System.out.println(emp.getName());
        System.out.println(emp.getCity());
    }
}