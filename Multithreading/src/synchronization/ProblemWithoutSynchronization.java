package synchronization;

public class ProblemWithoutSynchronization {
    static int counter = 0;
    public static void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable threadTask = () -> {
            increment();
            System.out.println("Counter After " + Thread.currentThread().getName() +
                    "Execution :- " +counter  );
        };

        Thread t1 = new Thread(threadTask);
        t1.setName("My Thread 1");
        t1.start();//Called by Thread 1
        Thread t2 = new Thread(threadTask);
        t2.setName("My Thread 2");
        t2.start();
        //t1.run();//Called by Main Thread.
        /*Output 1-> Counter After My Thread 2Execution :- 2
        Counter After My Thread 1Execution :- 2
        Output 2-: Counter After My Thread 1Execution :- 2
        Counter After My Thread 2Execution :- 2

        Here we are getting the same different data because counter shared and
        also method is not synchronized.*/
        /*To solve this we have three ways.
        Use atomic variable
        Use synchronized method.
        Use volatile keyword.*/

    }
}
