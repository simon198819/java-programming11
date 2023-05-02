class MyThread extends Thread
{
    class TestDemo3
    {
        public static void main(String[]args)
        {
            System.out.println(Thread.currntThread().getPriority());
            Thread.currentThread().setPriority(11);
            MyThread t=new MyThread();
            System.out.println(t.getPriority());
        }
    }
}