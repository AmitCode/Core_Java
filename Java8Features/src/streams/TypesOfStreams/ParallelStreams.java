package streams.TypesOfStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    /*In this stream, our code will be divided into the multiple part and will be executed
    separately on the separate core, but the result will be combination of them.
    In this, the order of execution is not our control and can produce unordered result.
    */
    public static void main(String[] args) {
        //There are two ways to create a parallel stream:-
        /*1.One of the simple ways to obtain a parallel stream is by invoking the
        parallelStream() method of Collection interface.
        2.Another way is to invoke the parallel() method of BaseStream interface on a
                sequential stream.*/
        //Way 1:
        List<Integer> integerArrayList = Arrays.asList(1,2,3,4,5,56,7,7);
        integerArrayList.parallelStream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));

        //for maintain order
        integerArrayList.parallelStream()
                .forEachOrdered(num -> System.out.print(num + " "));

        //Note: Parallel streams divide the data into chunks and process
        // them concurrently using the ForkJoinPool.

        //Way 2:
        System.out.println();
        integerArrayList.stream()
                .filter(num -> num > 2)
                .parallel()
                .forEach(num -> System.out.print(num + " "));

    }
}
