package streams.StreamCodingProblems.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String args[]){
        String s = "GeeksForGeeks";
        String resultedString = "";
        HashMap<Character,Integer> tempMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!tempMap.containsKey(ch)){
                resultedString = resultedString + ch;
                tempMap.put(ch,1);
            }
        }

        System.out.println("Old String: " + s);
        System.out.println("New String: " + resultedString);
        //Using HashSet
        HashSet<Character> set = new HashSet<>();
        String newResultedString = "";
        for (char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                newResultedString = newResultedString + ch;
            }
        }
        System.out.println("New String using hashSet: " +newResultedString);

        String newResultedStringStream = s.chars()
                .distinct()
                .mapToObj(
                (c) -> String.valueOf((char) c)).collect(Collectors.joining());
    }
}
