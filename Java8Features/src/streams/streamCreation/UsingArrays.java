package streams.streamCreation;

import java.util.Arrays;
import java.util.stream.Stream;

public class UsingArrays {
    public static void main(String[] args) {
        String[] strArray = {"234","Amit","Pandey"};
//      Stream<String> stream = Arrays.stream(strArray);
//      stream.forEach(num -> System.out.print(num + " "));
        Arrays.stream(strArray).forEach(str -> System.out.print(str + " "));
    }
}
