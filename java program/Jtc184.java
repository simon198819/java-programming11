class Hello Thread extends Thread
{
    public void Thread()
    {
        super();
        start();
    }
    public Hello Thread(String tname)
    {
        super(tname);
        start();
    }
    HelloThread(ThreadGroup tg,String tname)
    {
        super(tg,tname);
        start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"under the Thread group of"+Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}
public class Jtc184
{
    public static void main(String[]args)
    {
        ThreadGroup tg=new ThreadGroup();
        HelloThread t1=new HelloThread();
        HelloThread t2=new HelloThread("Jtc-1");
        HelloThread t3=new HelloThread(tg,"Jtc-2");
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"Under the Thread Group of:"+Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}