class ThreadA1
{
    public static void main(String[]args)throws Exception
 {
    ThreadB b=new ThreadB();
    b.start();
    synchronized(b)
    {
        System.out.println("main Thread calling wait");
          b.wait();
          System.out.println("main Thread got notification");
          System.out.println(b.total);    
    }
  }
}
class ThreadB extends Thread 
{
    int total=10;
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Thread start calculation");
            for(int i=0;i<=50;i++)
            {
                total=total+i;
            }
            System.out.println("Child Thread giving notification");
            this.notify();
        }
    }
}