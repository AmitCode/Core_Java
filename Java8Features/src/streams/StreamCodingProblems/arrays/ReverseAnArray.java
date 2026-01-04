package streams.StreamCodingProblems.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int stat = 0;
        int end = array.length-1;
        /*while (stat < end){
            array[stat] = array[stat] + array[end];
            array[end] = array[stat] - array[end];
            array[stat] = array[stat] - array[end];
            stat++;
            end--;
        }
        for (int num : array){
            System.out.print(num +", ");
        }*/

        int[] newArray = IntStream.rangeClosed(0,array.length - 1)
                .map((sIndex) -> array[array.length - 1 - sIndex])
                .toArray();

        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(newArray).forEach(System.out::print);

        System.out.println();
        int[] duplicatedArray = {1,4,2,5,2,8,2,5,3,2};
        int[] correctArray = IntStream.range(0, array.length-1)
                .distinct().toArray();

        IntStream.range(0, array.length-1).forEach(System.out::print);

        System.out.println();
        String duplicatedString = "AMITKUMARPANDEY";
        System.out.println(duplicatedString);

        String correctString = duplicatedString.chars()
                .mapToObj(str -> String.valueOf((char) str))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(correctString);

        int[] evenNumbersInTheArray = IntStream.rangeClosed(1,20)
                        .filter(num -> num % 2 == 0)
                                .toArray();
        System.out.println("Even Numbers from 1 -20");
        Arrays.stream(evenNumbersInTheArray)
                .forEach(num -> System.out.print(num + " "));

    }
}
