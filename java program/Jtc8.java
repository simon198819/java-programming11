package com.p4;
class JtcThread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("JTC\t"+i);
            try{
                sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}
class JtcThread2 extends Thread
{
    Thread th=null;
    void setThreadToJoin(Thread th)
    {
        this.th=th;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                if(i==50)
                {
                    th.join();
                }
            }catch(InterruptedException e){}
        }
    }
}
public class Jtc888
{
    public static void main(String[]args)
    {
        JtcThread1 ath=new JtcThread1();
        JtcThread2 bth=new JtcThread2();
        bth.setThreadToJoin(ath);
        ath.start();
        bth.start();
    }
}