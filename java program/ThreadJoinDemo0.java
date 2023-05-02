class MyThread extends Thread
{
        public void run()
    {
           for(int i=0;i<=5;i++)
         {
            System.out.println("Jemes Bond:Dia Another Day");
         }
 } 
 } 

        class ThreadjoinDemo0
        {
public static void main(String[]args)
{
    MyThread t=new MyThread();
        t.start();
        for(int i=0;i<=5;i++)
       {
      System.out.println("Jemes Bond:Quantum of Solicy");
          }
     }
} 