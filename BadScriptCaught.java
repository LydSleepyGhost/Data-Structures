import java.util.*;
public class BadScriptCaught
{

    public static void main(String args[])
{
    String[] names = {"Brandy", "Jenn", "Luke", "Paul", "Naomi", "Apollo", "Theodore", "John", "Steve", "Beth"};
    Scanner sc = new Scanner(System.in);
    System.out.println("Pick a number in the array");
    int num = sc.nextInt();
    try
    {
        System.out.println(names[num]);

    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("That number doesn't exist in the array, try again");
    }
}




}
