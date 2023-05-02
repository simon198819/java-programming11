class A
{
    void show()
    {
        System.out.println("Hello Viewer");
    }
}
class B extends A{
    void show()
    {
        super.show();
        System.out.println("Hello World");
    }
}
class Demo123
{
    public static void main(String[]args)
    {
        B r=new B();
        r.show();
    }
}