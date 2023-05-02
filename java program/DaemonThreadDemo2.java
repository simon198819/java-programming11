class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Indiana Jonse");
            System.out.println("Avenger part 2");
            System.out.println("Avenger Part-3");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}
class DaemonThreadDemo2
{
    public static void main(String[]args)
    {
   MyThread t=new MyThread();
    t.setDaemon(true);
    t.start();
    System.out.println("The Quantum of Solicy");
    System.out.println("Dai Another Day");
    }
}