// checks if item is in cart and how many
public class ItemOrder
{
   public boolean purchase = false;
   public int count;

    public boolean getPurchase() {return purchase;}
    public void setPurchase(boolean purchase) { this.purchase = purchase; }

    public int getCount() {return count;}
    public void setCount(int count) { this.count = count; }
}
