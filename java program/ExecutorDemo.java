import java.util.concurrent.*;
class PrintJob implements Runnable
{
    String name;
    PrintJob(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(name+"---job started by Thread:"+Thread.currentThread().getName());
    }
}
class ExecutorDemo
{
    public static void main(String[]args)
    {
        PrintJob[]jobs={new PrintJob("Simon");
        new PrintJob("Shiva");
        new PrintJob("Pavan");
        new PrintJob("Suresh");
        new PrintJob("Anil");
        new PrintJob("Jonathan");};
        ExecutorService service=Executors.newFixed ThreadPool(3);
        for(PrintJob job:jobs)
        {
            service.submit(job);
        }
        service.shutdown();
    }
}