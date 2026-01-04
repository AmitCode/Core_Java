package streams.TypesOfStreams.PrimitiveStream;

import java.util.stream.IntStream;

public class IntStreams {
    //They are used to process int values not Integer.
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 10);
        intStream.forEach(nums -> System.out.print(nums + " "));
        System.out.println();

        //There are many ways to create IntStream.
        //Way1: Using IntStream.of();
        IntStream intStreamUsingOf = IntStream.of(1,2,3,4,5,6);
        intStreamUsingOf.forEach(nums -> System.out.print(nums + " "));
        //It wraps the given int[] in a specialized Stream implementation without boxing to Integer.

        //Way2: Using IntStream.range();
        System.out.println();
        IntStream.range(2,10)
                .filter(num -> num % 2 == 0)
                .forEach(nums -> System.out.print(nums + " "));
        //Creates a lazy stream that iterates from start to end-1.
        //No storage — numbers are generated on demand.
        //Use case: When you need a loop-like stream, e.g., to replace for (int i = start; i < end; i++).
        //Only includes start but does not include end(start --> end -1).

        //Way2: Using IntStream.rangeClosed()
        System.out.println();
        IntStream.rangeClosed(1,5).forEach(num -> System.out.println(num + " "));
    }
}
