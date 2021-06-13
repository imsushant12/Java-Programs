class A
{
    public void fun1()
    {
        System.out.println("Hello from class-A");
    }
}

class B extends A
{
    public void fun1()
    {
        System.out.println("Hello from class-B");
    }
}

public class FunctionOverriding 
{
    public static void main(String[] args)
    {
        B objB = new B();
        objB.fun1();

        A objA = new A();
        objA.fun1();
    }
}
