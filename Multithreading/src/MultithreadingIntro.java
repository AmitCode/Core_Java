public class MultithreadingIntro {
    /*Multithreading is a process of executing multiple threads simultaneously in order to
    increase CPU utilization.
    A Thread is said to be the smallest of program. It a subprogram of a large program.
    Thread shares same memory but runs independently.
    Example:-*/
    public static void main(String[] args) {
        Runnable runnable = () -> {//---> This What the thread will execute that
                                    // means this is the task that will be executed by thread.

            System.out.println("Thread is running" +
                    Thread.currentThread().getName());
        };//---> This is thread task definition.
        Thread thread1 = new Thread(runnable);//This is thread creation.
        thread1.setName("Thread 1");//Setting the name of thread.
        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread 2");
        thread1.start();//This is thread starting, but when we are calling the start method
                        // this will guarantee that your thread will start immediately it
                        // will totally depend on thread schedular(CPU).
        thread2.start();
        //The sequence of execution of thread will totally depend on thread schedular(CPU).
        //Note:- 1 .There will be two thread created.
    }
}
