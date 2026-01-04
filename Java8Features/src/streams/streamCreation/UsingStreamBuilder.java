package streams.streamCreation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class UsingStreamBuilder {
    public static void main(String[] args) {
        //Other stream creation methods like collection,streamOf etc. adds the data to
        //the stream in one go, but suppose if we want to add data to s stream based
        //on some conditions, then Stream.builder() comes into picture.
        //Stream.builder() method allows us to add data to a stream based on some cont.
        Map<String,Boolean> userWithRoles = new HashMap<>();
        userWithRoles.put("Amit",true);
        userWithRoles.put("Rahul",false);
        userWithRoles.put("Aman",true);
        userWithRoles.put("Rajni",true);
        userWithRoles.put("Vinod",false);
        userWithRoles.put("Sumit",true);
        Stream.Builder<String> streams = Stream.builder();
        for (Map.Entry<String,Boolean> userInfo: userWithRoles.entrySet()){
            if(userInfo.getValue()){
                streams.add(userInfo.getKey());
            }
        }

        Stream<String> userRoleStream = streams.build();
        userRoleStream.forEach(userName -> System.out.print(userName + " "));
    //In above example users only be added to stream if they have admin role.
    //This is not possible with Stream.of() or Arrays.stream() unless you build the array or list first.
    }
}
