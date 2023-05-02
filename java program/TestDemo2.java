class MyThread extends Thread 
{
public void run()
{
    System.out.println("run method executed by Thread:"+Thread.currentThread().getName());
}
}
class TestDemo2
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main Thread executed by Thread"+Thread.currentThread().getName());
    }
}