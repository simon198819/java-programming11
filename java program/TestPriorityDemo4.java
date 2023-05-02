class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Herry Poter:The Coblert Of Fire");
        }
    }
}
class TestPriorityDemo4
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.setPriority(10);
        t.start();
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Fast and Furious 1");
            }
        }
    }
}