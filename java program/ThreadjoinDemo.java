class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
    {
        System.out.println("Avenger part 1");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
    }
     }
}
class ThreadjoinDemo
{
    public static void main(String[]args)throws InterruptedException
    {
        MyThread t=new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            try{
            System.out.println("Avenger Part 2");
            Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}