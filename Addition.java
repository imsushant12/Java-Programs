import java.util.Scanner;
public class Addition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first nuumber : ");
        int x = sc.nextInt();
        System.out.print("Enter second nuumber : ");
        int y = sc.nextInt();
        sc.close();
        System.out.println("Sum = " + (x+y));
    }
}
