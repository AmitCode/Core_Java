package streams.StreamCodingProblems.objectType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Q1. Create a Person class with name and age fields and print all names using Java 8 streams.
public class PrintAllNamesFromEmployee {
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

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        //This is ok if you are printing the name.
        employees.stream()
                //.map(p -> p.getName())
                .forEach(name -> System.out.println("Name : " + name.getName()));

        //But suppose you are collecting it in List of String (List<String>) then you have to
        //Transform it in String from object.
        //Because if you take above example e.g (name.getName()) it is in object for not in string.

        List<String> listOfName = employees.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        listOfName.forEach(System.out::println);

        /*Note:
        If you only need to display, don’t map.
        If you need to transform or collect, map.*/

    }
}
