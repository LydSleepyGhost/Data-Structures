import java.util.*;
public class BadMath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number ");
        double number = sc.nextDouble();
        double root;
        try
        {
            root = Math.sqrt(number);
            System.out.println(root);
        }
        catch(ArithmeticException e)
        {
            System.out.println("That's a negative number, you can't take the root of that");
        }
    }
}
