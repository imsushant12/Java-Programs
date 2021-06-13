public class StaticInitializationBlock 
{
    private static int x;
    {
        System.out.println("Static block! x = " + x);
        x = 5;
    }
    public StaticInitializationBlock()
    {
        System.out.println("Constructor! x = " + x);
    }
    public static void main(String[] args)
    {
        new StaticInitializationBlock();
        // StaticInitializationBlock s1 = new StaticInitializationBlock();        
        // StaticInitializationBlock s2 = new StaticInitializationBlock();        
    }
}
