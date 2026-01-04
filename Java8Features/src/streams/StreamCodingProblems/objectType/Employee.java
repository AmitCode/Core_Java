package streams.StreamCodingProblems.objectType;

public class Employee {
    private String name;
    private int age;
    private  double salary;

    private static Employee employee;
    private Employee() {}

    public static Employee getEmployee(){

        //if(employee == null){
            employee = new Employee();
        //}
        return employee;

    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
