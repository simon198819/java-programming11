class Hello
{
    int a;
    int b;
    static int c=30;
    Hello()
    {
        System.out.println("Defaultnconstructor in Hello");
    }
    Hello(int a)
    {
        System.out.println("1 Param constructor in Hello");
        this.a=a;
    }
    Hello(int a,int b)
    {
        System.out.println("2 param constructor in Hello");
        this.a=a;
        this.b=b;
    }
    Hello(int a,int b,int c)
    {
        System.out.println("3 param constructor in Hello");
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void show()
    {
        int a=101;
        int b=202;
        int c=303;
        System.out.println("show in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
}
class jtc82
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.show();
        Hello h2=new Hello(111);
        h2.show();
        Hello h3=new Hello(222,333);
        h3.show();
        Hello h4=new Hello(444,555,666);
        h4.show();
    }
}