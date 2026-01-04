package streams.StreamCodingProblems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1,"Amit",2),
                new Student(2,"Aman",4),
                new Student(3,"Shivam",2),
                new Student(3,"Ankit",1),
                new Student(3,"rahul",00)
        );

        students.stream()
                .forEach(student -> {
                    System.out.print(student.name +" ");
                });

        //Filter student with dept id
        System.out.println();
        students.stream()
                .filter(student -> student.dep_id == 2)
                .forEach(student -> System.out.print(student.name + " "));
        //Collect in the list

        List<Student> students2 =  students.stream()
                .filter(student -> student.dep_id == 2)
                .collect(Collectors.toUnmodifiableList());
        System.out.println();

        List<Student> studentByDeptAss = students.stream()
                .sorted(Comparator.comparing(student -> student.dep_id))
                .collect(Collectors.toList());

        studentByDeptAss.stream().forEach(student -> System.out.print(student.name + " "));

        List<Integer> list = Arrays.asList(1,2,3,2,1,2,7,4,2,6,5,6,3);
        List<Integer> distinctList =  list.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        Collections.reverse(distinctList);
        System.out.println(distinctList);
        List<Integer> newReverseList = distinctList.reversed().stream().collect(Collectors.toList());
        System.out.println(newReverseList);

    }
}