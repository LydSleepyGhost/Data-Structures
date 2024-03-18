import java.util.*;

public class ShoppingCart
{
    static ArrayList<Item> cart = new ArrayList<Item>();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int c = 0;

        System.out.println("Pick an option ");
        int input = sc.nextInt();
        System.out.println("[1] Tissues");
        System.out.println("[2] Milk");
        System.out.println("[3] Eggs");
        System.out.println("[4] Apples");
        System.out.println("[5] Lettuce");
        System.out.println("[6] Cheese");
        System.out.println("[7] Juice");
        System.out.println("[8] Meat");
        System.out.println("[9] Search");
        System.out.println("[10] Check out");
        System.out.println("[11] Remove");


        Item tissues = new Item();
        tissues.setName("Tissues");
        tissues.setPrice(3);

        Item milk = new Item();
        milk.setName("Milk");
        milk.setPrice(10);

        Item eggs = new Item();
        eggs.setName("Eggs");
        eggs.setPrice(12);

        Item apples = new Item();
        apples.setName("Apples");
        apples.setPrice(5);

        Item lettuce = new Item();
        lettuce.setName("Lettuce");
        lettuce.setPrice(5);

        Item cheese = new Item();
        cheese.setName("Cheese");
        cheese.setPrice(7);

        Item juice = new Item();
        juice.setName("Juice");
        juice.setPrice(7);

        Item meat = new Item();
        meat.setName("Meat");
        meat.setPrice(25);
/*using a case switch to create a smooth menu and each case is supposed to add the item to the list "cart"
and then ask how many you want and that will be put into a variable

 */
        switch (input)
        {
            case 1:
                cart.add(tissues);
                System.out.println("How many do you want? ");
                int input2 = sc2.nextInt();
                //c.setCount(input2);

            case 2:

            case 3:

        }


    }
}
