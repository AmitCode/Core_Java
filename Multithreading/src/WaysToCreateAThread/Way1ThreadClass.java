package WaysToCreateAThread;
/*The first way to create a thread is by using thread class.
How to do that:-
1.Extend the Thread class
2.Implements its run method.
3.Create thread class object.*/
public class Way1ThreadClass extends Thread {
    @Override
    public void run(){
        System.out.println("Thread " +currentThread().getName() +" is running.");
    }

    public static void main(String[] args){
        Thread thread1 = new Thread(new Way1ThreadClass());
        thread1.setName("1");
        thread1.start();
        Thread thread2 = new Thread(new Way1ThreadClass());
        thread2.setName("2");
        thread2.start();//Thread execution is depended on thread schedular.
    }

    /*When to use it:-
    1.When your class is not extending any other class as java does not support the multiple
        inheritance.
    2.When you want a simple program.*/
}
