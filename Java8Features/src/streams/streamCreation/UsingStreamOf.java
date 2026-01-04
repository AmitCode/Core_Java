package streams.streamCreation;

import java.util.stream.Stream;

public class UsingStreamOf {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,34,4,5,6);
        integerStream.forEach(num -> System.out.print(num + " "));

        Stream<String> stringStream = Stream.of("Amnut","343","ajgshh");
        stringStream.forEach(str -> System.out.print(str + " "));
/*      Advantages: Quick and concise for small, known datasets.
        Disadvantages: Not suitable for dynamic or large datasets.
        Use Cases: Testing, prototyping, or working with hardcoded values.*/
    }
}
