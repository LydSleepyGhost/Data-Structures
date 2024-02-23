
import java.util.*;

public class Lab
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        int count = 0;
        for (int i = 0; i < 21; i++)
        {
            System.out.println("Add a double! ");
            double num = sc.nextDouble();
            numbers.add(num);
            count += 1;
            System.out.println("You are on number "+ "[" + count + "]");
            System.out.println("Are you done? [y/n] ");
            Scanner sc2 = new Scanner(System.in);
            String exit = sc2.nextLine();
            if (exit.equals("y"))
            {
               i = 21;
            }
        }
        System.out.println(numbers);

    }

}
