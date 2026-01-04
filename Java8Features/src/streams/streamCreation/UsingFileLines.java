package streams.streamCreation;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UsingFileLines {
    public static void main(String[] args) {
        try{
            Stream<String> fileData = Files.lines(Paths.get("E:\\data.txt"));
            fileData.forEach(num -> System.out.print(num + " "));
        }catch (Exception ex){

        }
    }
}
