class Display
{
    public synchronized void displayn()
{
    for(int i=0;i<=10;i++)
    {
        System.out.println(i);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
    }
}
}
public synchronized void displayc()
{
    for(int i=65;i<=75;i++)
    {
        System.out.println((char));
        {
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
    }
    }
}
class MyThread extends Thread{
    Display d;
    MyThread1(Display d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display n();
    }
}
class MyThread2 extends Thread{
    Display d;
    MyThread2(Display d)
    {
        this.d=d;
    }
    public void run()
    {
        d.displayc();
    }
}
class synchronizedDemo2
{
    public static void main(String[]args)
    {
        Display d=new Display();
        MyThread t1=new MyThread1(d);
        MyThread t2=new MyThread2(d);
        t1.start();
        t2.start();
    }
}