public class OurThrowDefaultOurException 
{
    public static void main(String[] args)
    {
        int balance = 5000;
        int withdrawAmount = 6000;
        try
        {
            if(balance < withdrawAmount)
                throw new ArithmeticException("Balance is low!");
        }
        catch(Exception e)
        {
            System.out.println("Catched Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Finally");
        }
    }    
}


/*
public class OurThrowDefaultOurException 
{
    public static void main(String[] args)
    {
        int balance = 5000;
        int withdrawAmount = 6000;
        try
        {
            if(balance < withdrawAmount)
                throw new ArithmeticException("Balance is low!");
        }
        // catch(Exception e)
        // {
        //     System.out.println("Catched Exception : " + e.getMessage());
        // }
        finally
        {
            System.out.println("Finally");
        }
    }    
}

*/