

import java.util.*;

public class MoneyConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your amount of money ");
        double input = 0;
        boolean check = true;
        while (check)
        {
            if (sc.hasNextDouble())
            {
                input = sc.nextDouble();
                check = false;
            }
            else
            {
                System.out.println("That's not a number");
                sc.nextLine();
            }
        }

        double amount = input * 100;
        double quarters = amount / 25;
        amount = amount % 25;
        double dimes = amount / 10;
        amount = amount % 10;
        double nickles = amount / 5;
        amount = amount % 5;
        double pennies = amount;

        if (quarters == 1)
        {
            System.out.println("1 quarter");
        }
        else if (quarters > 1)
        {
            System.out.println((int)quarters + " quarters");
        }
        if (dimes == 1)
        {
            System.out.println("1 dime");
        }
        else if (dimes > 1)
        {
            System.out.println((int)dimes + " dimes");
        }
        if (nickles == 1)
        {
            System.out.println("1 nickel");
        }
        else if (nickles > 1)
        {
            System.out.println((int)nickles + " nickles");
        }
        if (pennies == 1)
        {
            System.out.println("1 penny");
        }
        else if (pennies > 1)
        {
            System.out.println((int)pennies + " pennies");
        }
    }
}
