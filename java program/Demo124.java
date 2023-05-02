class A
{
    A(int a)
    {
        System.out.println("Hello World");
    }
}
class B extends A{
    B()
    {
    super(200);
    System.out.println("Hello India");
}
}
class Demo124
{
    public static void main(String[]args)
    {
        B r=new B();
    }
}
