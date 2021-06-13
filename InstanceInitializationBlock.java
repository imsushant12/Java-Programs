public class InstanceInitializationBlock 
{
    private int x;
    {
        System.out.println("Initialization block! x = " + x);
        x = 5;
    }
    public InstanceInitializationBlock()
    {
        System.out.println("Constructor! x = " + x);
    }
    public static void main(String[] args)
    {
        InstanceInitializationBlock i1 = new InstanceInitializationBlock();        
        InstanceInitializationBlock i2 = new InstanceInitializationBlock();        
    }
}
