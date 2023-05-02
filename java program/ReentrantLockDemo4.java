import java.util.concurrent.locks.*;
class MyThread extends Thread
{
    ReentrantLock l=new ReentrantLock();
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        if(l.tryLock())
        {
            System.out.println(Thread.currentThread().getName()+"---got locks and performin safe equeations");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
            l.lock();
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"----unable to get lock and hence performing alternative operation");
        }
    }
}
class ReentrantLockDemo4
{
    public static void main(String[]args)
    {
        MyThread t1=new MyThread("First Thread");
        MyThread t2=new MyThread("Second Thread");
        t1.start();
        t2.start();
    }
}