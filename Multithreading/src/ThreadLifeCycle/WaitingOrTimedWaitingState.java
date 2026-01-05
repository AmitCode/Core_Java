package ThreadLifeCycle;

public class WaitingOrTimedWaitingState implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in " +
        Thread.currentThread().getState() + " State.");
        System.out.println("Hi Amit");
        try {
            Thread.sleep(500);
            System.out.println("My Thread is in TIMED WAITING State for 500ms");
        }catch (Exception e){
            System.out.println("[WaitingOrTimedWaitingState] - {run-sleep} - Ex "
                    +e.getMessage());
        }

        System.out.println(Thread.currentThread().getName() + " is in " +
                Thread.currentThread().getState() + " State.");
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new WaitingOrTimedWaitingState());
        thread1.setName("My Thread");
        System.out.println("My Thread is in " + thread1.getState());
        thread1.start();

    }
}
