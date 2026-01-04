package streams.StreamCodingProblems.objectType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q2. Filter persons older than 25.
public class FilterPersons {
    public static void main(String[] args) {
        Employee employee1 = Employee.getEmployee()
                .setName("Amit Kumar Pandey")
                .setSalary(50000)
                .setAge(26);

        Employee employee2 = Employee.getEmployee()
                .setName("Aman Kumar Pandey")
                .setSalary(50000)
                .setAge(29);

        Employee employee3 = Employee.getEmployee()
                .setName("Shivam Kumar Pandey")
                .setSalary(50000)
                .setAge(15);

        Employee employee4 = Employee.getEmployee()
                .setName("Shivam Kumar Pandey")
                .setSalary(50000)
                .setAge(19);

        Employee employee5 = Employee.getEmployee()
                .setName("Shivam Kumar Pandey")
                .setSalary(50000)
                .setAge(17);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3,
                employee4, employee5);

        employees.stream()
                .filter(employee -> employee.getAge() > 17)
                .forEach(employee ->  System.out.println("Name: " +
                        employee.getName()));
        //Filter used to filter some data from streams of data based on some conditions.

        //Filter + collect

        List<String> listOfEmployeesBasedOnAge =
                employees.stream()
                        .filter(employee -> employee.getAge() > 20)
                        .map(employee -> employee.getName())
                        .collect(Collectors.toList());

        //Filter is filtering the data from streams and then collecting name from that filtered data
        System.out.println("List of filtered employees names based on age >  20");
        listOfEmployeesBasedOnAge.forEach(System.out::println);
    }
}
