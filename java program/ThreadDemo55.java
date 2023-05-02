class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(2000);
                System.out.println("Avenger Part-1");
            }
            catch(InterruptedException e){}
        }
    }
} 
class ThreadDemo55
{
    public static void main(String[]args)throws InterruptedException
    {
        MyThread t=new MyThread();
        t.start();
        t.join();
        for(int i=0;i<5;i++)
        {
            try{
                System.out.println("Fast and Furious");
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}