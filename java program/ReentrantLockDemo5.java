import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class MyThread extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        do
    {
        try{
            if(l.tryLock(5000,TimeUnit.MILLISECONDS))
            {
                System.out.println(Thread.currentThread().getName()+"got Lock");
                Thread.sleep(2000);
                l.unlock();
                System.out.println(Thread.currentThread().getName()+"----release lock");
                break;
            }
            else
            {
System.out.println(Thread.currentThread().getName()+"----unable to get lock and will try again");
            }
        }
        catch(InterruptedException e){}
    }
    while(true);
}
}
class ReentrantLockDemo5
{
    public static void main(String[]args)
    {
        MyThread t1=new MyThread("First Thread");
        MyThread t2=new MyThread("Second Thread");
        t1.start();
        t2.start();
    }
}