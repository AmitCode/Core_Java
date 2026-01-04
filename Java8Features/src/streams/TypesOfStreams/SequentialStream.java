package streams.TypesOfStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequentialStream {
    public static void main(String[] args) {
        //This stream process one element at a time using a single thread.
        //This is a default behavior when we call stream().

        List<Integer> integerArrayList = Arrays.asList(9,2,6,1,5,7,10,63453,619);

//        List<Integer> evenNumber = integerArrayList.stream()
//                .filter(num -> num % 2 == 0).toList();
        integerArrayList.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));

        /*advantages:
        1.maintains the order of element
        2.no concurrency issue

        disadvantages:
        1.not suitable for large data set.
        2.not suitable for multicore systems/processors as we will not utilize them

        UseCases:
        1.Small to medium size collection.
        2.Where thread safety is more important.*/
    }
}
