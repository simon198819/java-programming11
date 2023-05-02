interface interf
{
    public void m1();
}
class LambdaTest1
{
public static void main(String[]args)
{
    Interf i=()->System.out.println("Hello---By lambda Expression");
    i.m1();
}
}

