package synchronization;

/*Synchronization is a mechanism in which helps us to control the access of shared resources*/
public class Synchronization {
    static int counter = 0;
    synchronized public static void increment(){
        counter++;
        System.out.println("Counter After " + Thread.currentThread().getName() +
                "Execution:- " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable threadTask = () -> {
            increment();
        };

        Thread thread1 = new Thread(threadTask);
        Thread thread2 = new Thread(threadTask);
        thread1.setName("My Thread 1");
        thread2.setName("My Thread 2");
        thread1.start();
        thread2.start();
        /*
        * Counter After My Thread 1Execution:- 2
          Counter After My Thread 2Execution:- 2 sometimes you get this output because both thread are
          incrementing first printing the data one by one*/
    }
}
