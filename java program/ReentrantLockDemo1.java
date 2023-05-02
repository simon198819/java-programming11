import java.util.concurrent.locks.*;
class Display
{
    ReentrantLock l=new ReentrantLock();
    public void wish(String name)
    {
        l.lock();
        for(int i=0;i<5;i++)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            l.unlock();
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class ReentrantLockDemo1
{
public static void main(String[]args)
{
    Display d=new Display();
    MyThread t1=new MyThread(d,"Dhoni");
    MyThread t2=new MyThread(d,"Kohli");
    MyThread t3=new MyThread(d,"Dhawan");
    t1.start();
    t2.start();
    t3.start();
}
}