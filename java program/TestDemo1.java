class MyThread extends Thread
{
    public void start()
    {
System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("run Method");
    }
}
class TestDemo1
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main Thread");
    }
}


    
