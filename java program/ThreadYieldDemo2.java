
class MyThread extends Thread
{
public void run()
{
    for(int i=0;i<5;i++)
    {
        System.out.println("Fast and Furiou-2");
        Thread.yield();
    }
}
}
class ThreadYieldDemo2
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        for(int i=0;i<5;i++)
        {
            try{
                System.out.println("Thunder Bolt");
                Thread.sleep(2000);
            }
          catch(InterruptedException e){}
        }
    }
}