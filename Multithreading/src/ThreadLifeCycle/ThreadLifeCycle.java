package ThreadLifeCycle;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName()
                    + " is running.");
        };
        //NEW State.
        Thread thread = new Thread(task);
        thread.setName("My Thread");
        System.out.println("Thread State: " + thread.getState());
        //RUNNABLE State.
        thread.start();
        System.out.println("Thread Name: " + thread.getState());
        //Note:- It is not necessary when call start method our thread will start executing.
        /*NEW(new Thread) --> RUNNABLE(start()) --> RUNNING(Running by CPU) -->
        WAITING/TimedWaitingState(sleep(),wait()) --> REMOVED()*/
    }
}
