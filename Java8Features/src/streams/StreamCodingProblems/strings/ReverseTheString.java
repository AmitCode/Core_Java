package streams.StreamCodingProblems.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "abcde";
        int strLen = str.length()-1;
        String newString = IntStream.range(0, str.length())
                .mapToObj(index  -> String.valueOf((char) str.charAt(strLen - index)))
                .collect(Collectors.joining());
        System.out.println(newString);
    }
}
