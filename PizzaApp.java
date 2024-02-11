import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PizzaApp extends JFrame
{
   JLabel size = new JLabel("Select your Pizza Size");
   JButton small = new JButton("Small [$5.00]");
   JButton medium = new JButton("Medium [$10.00]");
   JButton large = new JButton("Large [$15.00]");
   JButton supersize = new JButton("Super [$20.00]");
   Font bigfont = new Font("Ariel", Font.BOLD, 16);
   JLabel total = new JLabel("Your total currently is:");
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

   float moneytotal = 0;
   int counter = 0;

   final int Width = 300;
   final int Hight = 200;

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
      add(next);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      small.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 5;
         }
      });
      medium.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 10;

         }
      });
      large.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 15;
         }
      });
      supersize.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            moneytotal += 20;
         }
      });
      next.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            new PizzaApptwo();
         }
      });
      //setVisable(true);
   }

   public PizzaApptwo()
   {
      super("Pizza App cont...");
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
      add(next);
      pepperoni.addItemListener((ItemListener) this);
      olives.addItemListener((ItemListener) this);
      peppers.addItemListener((ItemListener) this);
      pineapple.addItemListener((ItemListener) this);
      anchovies.addItemListener((ItemListener) this);
      ham.addItemListener((ItemListener) this);
      sausage.addItemListener((ItemListener) this);
      mushrooms.addItemListener((ItemListener) this);
      extra_cheese.addItemListener((ItemListener) this);
      next.addItemListener((ItemListener) this);

      pepperoni.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {

         }

      });
      olives.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      peppers.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      pineapple.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      anchovies.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      ham.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      sausage.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      mushrooms.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      extra_cheese.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      next.addItemListener(new ItemListener()
      {
         @Override
         public void itemStateChanged(ItemEvent e)
         {
         }

      });
      //setVisable(true);
   }

   public static void main(String[] args)
   {
      new PizzaApp();
      //setVisable(true);

   }

}
