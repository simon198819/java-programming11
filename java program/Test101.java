import java.io.*;
class Test101
{
    public static void main(String[]args)throws Exception
    {
        int count=0;
        File f=new File("c:\\durga_classes");
        String[]s=f.list();
        for(String s1:s)
        {
            count ++;
            System.out.println("The total number"+count);
        }
    }
}