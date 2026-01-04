package streams.StreamCodingProblems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,52,6,5,1,2,3,8,9,7,8,9};
        int[] newArray = Arrays.stream(arr)
                .distinct()
                .toArray();
        Arrays.stream(newArray).forEach(System.out::println);

        //Collect to list
        //Solution 1:
        List<Integer> arrayList = IntStream.rangeClosed(0,arr.length-1)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        //Solution 2: Best Solution

        //Note:----->
        //Use IntStream.range() / rangeClosed() when you need to work with array indexes,
        // for example: Reverse an array.Reverse an array,Access element positions,Update
        // values based on index,Loop from 0 → n-1

        //Use Arrays.stream(arr) when you want to work with actual array values
        /*Ex
        Remove duplicates,Filter,Map values,Convert to List,Sort*/
        List<Integer> collectInList = Arrays.stream(arr)
                .distinct()
                .boxed()//Best Practice.
                .collect(Collectors.toList());


        //Why map() fails?:- IntStream.map() expects a function that takes an int and returns an int.
        //So ---> .map(num -> Integer.valueOf(num));  // ❌ Not allowed (returns Integer)
        //.mapToObj(n -> Integer.valueOf(n)) because it does int -> Integer.
        //Best practice use boxed().


        /*Arrays.stream(int[]) returns an IntStream, which only accepts primitive-specific mapping
        operations.
        map() cannot convert primitives to objects because it must return primitive int.
        Although mapToObj() can perform int → Integer conversion, Java provides a cleaner
        method: boxed().
        Therefore, .boxed() is the recommended and idiomatic way to convert an IntStream
        to Stream<Integer> before collecting into a List."*/



    }
}
