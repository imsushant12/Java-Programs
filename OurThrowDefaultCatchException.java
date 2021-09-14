public class OurThrowDefaultCatchException 
{
    public static void main(String[] args)
    {
        int balance = 5000;
        int withdrawAmount = 6000;
        
        if(balance < withdrawAmount)
            throw new ArithmeticException("Balance is low!");
        
        System.out.println("Block after throw");
    }    
}
