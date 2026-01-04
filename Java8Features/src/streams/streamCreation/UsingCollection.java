package streams.streamCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class UsingCollection {
    public static void main(String[] args) {
        /*Using Collection Approach:
        Get the collection
        Construct a Sequential Stream from the collection using Collection.stream() method
        Print the Stream\*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Stream<Integer> streamInteger = arrayList.stream();
        streamInteger.forEach(x -> System.out.print(x + " "));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("shgdf");
        strings.add("3465");
        strings.add("ahsfghas");
        strings.add("7ajsvbd8732");
        Stream<String> stringStream = strings.stream();
        stringStream.forEach(s -> System.out.print(s + " "));

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,56,6);
        Stream<Integer> integerStream = integerList.stream();
        integerStream.forEach(nums -> System.out.print(nums + " "));

        List<String> stringList = Arrays.asList("amfh","263","dgfh");
        Stream<String> strStream = stringList.stream();
        strStream.forEach(str -> System.out.print(str + " "));

        //Use Cases: Filtering, mapping, and reducing data from lists or sets.
    }
}
