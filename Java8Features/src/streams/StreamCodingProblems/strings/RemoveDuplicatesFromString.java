package streams.StreamCodingProblems.strings;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Amit Kumar Pandey";
        String newStr = str.chars()
                .distinct()
                .mapToObj(character -> String.valueOf((char) character))
                .collect(Collectors.joining());
        System.out.println("Old String: " + str);
        System.out.println("New String: " + newStr);
    }
}
