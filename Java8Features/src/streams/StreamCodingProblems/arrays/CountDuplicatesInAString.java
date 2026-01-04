package streams.StreamCodingProblems.arrays;

import java.util.HashSet;

public class CountDuplicatesInAString {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                count++;
            }else{
                set.add(ch);
            }
        }
        System.out.println("Duplicates in the string are: " +count);
    }
}
