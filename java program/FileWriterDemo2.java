import java.io.*;
class FileWriterDemo2
{
    public static void main(String[]args)throws IOException
    {
        FileWriter fw=new FileWriter("abc.text");
        fw.write(100);//adding a single charecter
        fw.write("urga\n SoftwareSolution");
        fw.write('\n');
        char[]ch1={'a','b','c'};
        fw.write(ch1);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
