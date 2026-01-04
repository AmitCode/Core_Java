package streams.streamCreation;

import java.util.stream.Stream;

public class UsingStreamGenerate {
    public static void main(String[] args) {
        Stream<Double> randomData = Stream.generate(() ->
                Math.random()).limit(5);
        randomData.forEach(nums -> System.out.print(nums + " "));

    }
}
