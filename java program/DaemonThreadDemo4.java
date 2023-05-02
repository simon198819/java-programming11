class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Indiana Jonse");
            System.out.println("Avenger Part 1");
            System.out.println("I am Unstaopable");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}
class DaemonThreadDemo4
{
    public static void main(String[]args)
    {
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
   MyThread t=new MyThread();
    t.setDaemon(false);
    t.start();
    System.out.println("The Quantum of Solicy");
    System.out.println("Dai Another Day");
    }
}
}