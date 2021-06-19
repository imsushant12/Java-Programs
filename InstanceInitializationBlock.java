public class InstanceInitializationBlock 
{
    public int x;
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
        System.out.println("Instance block 1 : " + i1.x);   
        i1.x = i1.x+1;     
        InstanceInitializationBlock i2 = new InstanceInitializationBlock();       
        System.out.println("Instance block 1 : " + i1.x); 
        System.out.println("Instance block 2 : " + i2.x);  
    }
}
