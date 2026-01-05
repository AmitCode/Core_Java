package WaysToCreateAThread;
/*Way 2: Using runnable interface.
How to do this:-
1.Implement the Runnable interface.
2.It is a functional interface, that means it have only one method that is run.
3.Create a thread class object by wapping the runnable in to it.*/
public class Way2RunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName()
                + " is running by overriding the run method.");//--> This task definition.
    }

    public static void main(String[] args) {
        //Way 1.
        Thread thread1 = new Thread(new Way2RunnableInterface());//---> This thread creation.
        thread1.setName("1");
        Thread thread2 = new Thread(new Way2RunnableInterface());
        thread2.setName("2");
        thread1.start();
        thread2.start();
        //Way 2.
        Runnable runnable = () -> {
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " is running by implementing the run method using lambda expression.");
        };
        Thread thread3 = new Thread(runnable);
        thread3.setName("3");
        thread3.start();
        Thread thread4 = new Thread(runnable);
        thread4.setName("4");
        thread4.start();
    }

    /*When to use:-
    1.You want to define task separation and task execution.
    2.You want to use Executor service/Thread Pool because they works only with runnable or callable.
    3.Better design.
    4.Your class already extending any other class.*/
}
