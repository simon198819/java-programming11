class Display
{
    public synchronized void wish(String name)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class synchronizedDemo7
{
    public static void main(String[]args)throws Exception
    {
        Display d=new Display();
        MyThread t1=new MyThread(d,"Dhoni");
        MyThread t2=new MyThread(d,"Kohli");
        t1.start();
        t2.start();
        t2.join();
    }
}