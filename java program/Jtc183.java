class HelloThread extends Thread
{
    public HelloThread()
    {
        super();
        start();
    }
public HelloThread(String tname)
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
        System.out.println(Thread.currentThread().getName()+"under the Thread Group of:"+Thread.currentThread().getThreadGroup().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
   }
 }
}
 public class Jtc183
 {
    public static void main(String[]args)
    {
        ThreadGroup tg=Thread.currentThread().getThreadGroup();
        HelloThread th1=new HelloThread();
        HelloThread th2=new HelloThread("Jtc-1");
        HelloThread th3=new HelloThread(tg,"Jtc-2");
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"under the Thread group of:"+Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){}
     }
 }
}