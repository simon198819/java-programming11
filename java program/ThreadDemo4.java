class MyRunnable implements Runnable
{
public void run()
  {
    for(int i=0;i<5;i++)
      {
        try 
        {
            Thread.sleep(2000);    
        } 
        catch (InterruptedException e){}
         System.out.println("Avenger Part 2");
    }
  }
}
class ThreadDemo4
{
    public static void main(String[]args)
    {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<5;i++)
        {
            try{
                System.out.println("The Beautiful Mind");
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}  
        }
    }
}


