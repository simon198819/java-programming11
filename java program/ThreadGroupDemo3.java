class MyThread extends Thread
{
    MyThread(ThreadGroup g,String name)
    {
        super(g,name);
    }
        public void run()
        {
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
class ThreadGroupDemo3
{
    public static void main(String[]args)throws Exception
    {
        ThreadGroup pg=new ThreadGroup("Parent Group");
        ThreadGroup cg=new ThreadGroup("Child Group");
        MyThread t1=new MyThread(pg,"Child Group");
        MyThread t2=new MyThread(cg,"Child Group");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }
}