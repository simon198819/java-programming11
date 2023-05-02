class Hello
{
    int a;
    int b;
    static int c=30;
    {
        int a=101;
        int b=202;
        int c=303;
        System.out.println("IB in Hello");
        System.out.println(this);
        System.out.println(this.hashCode());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static{
      int a=101;
      int b=202;
      int c=303;
      System.out.println("SB in Hello"); 
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
    Hello()
    {
        System.out.println("defaut constructor in Hello");
        System.out.println(this);
        System.out.println(this.hashCode());
    }
    Hello(int a)
    {
        System.out.println("1 param constructor in Hello");
        System.out.println(this);
        System.out.println(this.hashCode());
        this.a=a;
    }
    Hello(int a,int b)
    {
        System.out.println("2 param constructor in Hello");
        System.out.println(this);
        System.out.println(this.hashCode());
        this.a=a;
        this.b=b;
    }
    void show()
    {
        int a=100;
        int b=200;
        int c=300;
        System.out.println("show in Hello");
        System.out.println(this);
        System.out.println(a);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
    static void show1()
    {
        int a=999;
        int b=888;
        int c=777;
        System.out.println("show1 in Hello");
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class jtc83
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        System.out.println(h1);
        System.out.println(h1.hashCode());
        h1.show();
        System.out.println("***2nd object creation***");
        Hello h2=new Hello(999);
        h2.show();
    }
}