import java.io.*;
class FileWriterDemo2
{
    public static void main(String[]args)throws ioException
    {
        FileWriter fw=new FileWriter("abc.text");
        fw.Write (100);//adding a single charecter
        fw.write("urga\n SoftwareSolution");
        fw.write('\n');
        char[]ch1={'a','b','c'};
        fw.write(ch1);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
