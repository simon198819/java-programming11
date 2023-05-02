class MyThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("I am Lazy Thread");
            Thread.sleep(2000);
            }
        }catch(InterruptedException e){}
        System.out.println("I got Interrupted");
    }
}
class ThreadSleepDemo1
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of main Thread");
    }
}