package streams.StreamCodingProblems.objectType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q3.Sort employees by salary in descending order.
public class SortEmployeeBasedWithCond {
    public static void main(String[] args) {
        Employee employee1 = Employee.getEmployee()
                .setName("Amit Kumar Pandey")
                .setSalary(5345000)
                .setAge(26);

        Employee employee2 = Employee.getEmployee()
                .setName("Aman Kumar Pandey")
                .setSalary(345345)
                .setAge(29);

        Employee employee3 = Employee.getEmployee()
                .setName("Shivam Kumar Pandey")
                .setSalary(3463)
                .setAge(15);

        Employee employee4 = Employee.getEmployee()
                .setName("Rahul")
                .setSalary(56746464)
                .setAge(19);

        Employee employee5 = Employee.getEmployee()
                .setName("Ankit")
                .setSalary(232234)
                .setAge(17);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3,
                employee4, employee5);
        System.out.println("Without sorting---:->");
        employees.forEach(employee -> System.out.print("Name: " + employee.getName() +" "));

        //Sorting Employee based on salary.
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(employee -> System.out.println("Name:- "
                        +employee.getName()));

        //The Comparator.comparing() method returns a Comparator that compares objects based on a
        // specific key — here, the employee’s salary.
        //The reversed() method in the Comparator interface returns a new comparator with the
        // reverse order of the original one.

        List<Employee> employeesInSortedOrder = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .toList();
    }
}
