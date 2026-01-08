package synchronization;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*ClassLevel synchronization is a type of synchronization where the lock will be acquired
   over class.
   That means only one object will be access the critical section at a time.*/
public class ClassLevelSynchronization {
    public static void main(String[] args) throws InterruptedException {
//        IncrementClass incrementClass1 = new IncrementClass();
//        IncrementClass incrementClass2 = new IncrementClass();
//        Thread thread1 = new Thread(incrementClass1::increment, "My Thread 1");
//        Thread thread2 = new Thread(incrementClass2::increment, "My Thread 2");
//        thread1.start();
//        thread2.start();
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 1};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }
}

class IncrementClass{
    int counter;
    synchronized void increment(){
        counter++;
        System.out.println("Counter After " + Thread.currentThread().getName() +
                "Execution:- " + counter);
    }
}
