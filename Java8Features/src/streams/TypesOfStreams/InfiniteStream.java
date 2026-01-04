package streams.TypesOfStreams;

import java.util.UUID;
import java.util.stream.Stream;

public class InfiniteStream {
    //This Stream is used to create infinite stream in java.
    public static void main(String[] args) {
        //Ways to create Infinite Stream interface.
        //Way 1: Using iterate method of Stream.
        Stream<Integer> evenStream = Stream.iterate(1, num -> num +2);
        evenStream.limit(20).forEach(num -> System.out.print(num + " "));

        //Way2: Using generate() method.
        System.out.println();
        Stream<String> ids = Stream.generate(() -> "IDS" + UUID.randomUUID());
        ids.limit(5).forEach(id -> System.out.println(id + " "));
    }
}
