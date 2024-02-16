import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PizzaApp extends JFrame implements ItemListener
{
   JLabel size = new JLabel("Select your Pizza Size");
   JButton small = new JButton("Small [$5.00]");
   JButton medium = new JButton("Medium [$10.00]");
   JButton large = new JButton("Large [$15.00]");
   JButton supersize = new JButton("Super [$20.00]");
   Font bigfont = new Font("Ariel", Font.BOLD, 16);
   JLabel total = new JLabel("Your total currently is: " + moneytotal);
   JLabel toppings = new JLabel("What toppings would you like? (Pick 3)");
   JCheckBox pepperoni = new JCheckBox("Pepperoni", false);
   JCheckBox olives = new JCheckBox("Olives", false);
   JCheckBox peppers = new JCheckBox("Peppers", false);
   JCheckBox pineapple = new JCheckBox("Pineapple", false);
   JCheckBox anchovies = new JCheckBox("Anchovies", false);
   JCheckBox ham = new JCheckBox("Ham", false);
   JCheckBox sausage = new JCheckBox("Sausage", false);
   JCheckBox mushrooms = new JCheckBox("Mushrooms", false);
   JCheckBox extra_cheese = new JCheckBox("Extra Cheese", false);
   JButton next = new JButton("Next");

   static float moneytotal = 0;
   int counter = 0;

   final int Width = 500;
   final int Hight = 300;

   public PizzaApp()
   {
      super("Pizza App");
      setSize(Width, Hight);
      setLayout(new FlowLayout());
      size.setFont(bigfont);
      add(size);
      add(small);
      add(medium);
      add(large);
      add(supersize);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      small.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 5;
            PizzaApptwo();

         }
      });
      medium.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 10;
            PizzaApptwo();

         }
      });
      large.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 15;
            PizzaApptwo();
         }
      });
      supersize.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 20;
            PizzaApptwo();
         }
      });
   }

   public void PizzaApptwo()
   {
      setSize(Width, Hight);
      setLayout(new FlowLayout());
      toppings.setFont(bigfont);
      add(pepperoni);
      add(olives);
      add(peppers);
      add(pineapple);
      add(anchovies);
      add(ham);
      add(sausage);
      add(mushrooms);
      add(extra_cheese);
      add(total);
      next.setVisible(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pepperoni.addItemListener( this);
      olives.addItemListener((ItemListener) this);
      peppers.addItemListener((ItemListener) this);
      pineapple.addItemListener((ItemListener) this);
      anchovies.addItemListener((ItemListener) this);
      ham.addItemListener((ItemListener) this);
      sausage.addItemListener((ItemListener) this);
      mushrooms.addItemListener((ItemListener) this);
      extra_cheese.addItemListener((ItemListener) this);
      next.addItemListener((ItemListener) this);

     /* pepperoni.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;

         }

      });
      olives.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      peppers.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      pineapple.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      anchovies.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      ham.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      sausage.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      mushrooms.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            moneytotal += .5;
         }

      });
      extra_cheese.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });*/
      next.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
            System.out.println("Total is Final " + moneytotal);
         }

      });

   }
   @Override
   public void itemStateChanged(ItemEvent e) {
      Object source = e.getItem();
      String sTopping = ((JCheckBox)source).getText();
      System.out.println("Checkbox " + e.getStateChange());
      if(sTopping != "Extra Cheese") {
         System.out.println("Topping Selected " + sTopping);
         int select = e.getStateChange();
         if (select == ItemEvent.SELECTED) {
            moneytotal += .5;
         }
         else
            moneytotal -= .5;
      }
      else
         System.out.println("You added " + sTopping + " so no charge");
      total.setText("Total is After " + moneytotal);
      //System.out.println("Total is After " + moneytotal);
   }


   public static void main(String[] args)
   {
      PizzaApp myPizza = new PizzaApp();
   }

}
