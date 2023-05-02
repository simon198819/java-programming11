class MyThread extends Thread
{
    static Thread mt;
public void run()
{
    for(int i=0;i<5;i++)
    {
        try{
            mt.join();
        }
        catch(InterruptedException e){}
        {
            System.out.println("Alice The Wonderline");
        }
    }
}
}
class ThreadjoinDemo2
{
    public static void main(String[]args)throws InterruptedException
    {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        t.start();
        for(int i=0;i<5;i++)
        {
          System.out.println("I am Unstopable");
          Thread.sleep(2000);
        }
    }
}