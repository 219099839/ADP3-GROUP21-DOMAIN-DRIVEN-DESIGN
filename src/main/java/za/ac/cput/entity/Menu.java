package za.ac.cput.entity;
/*

Mpho Sefoloko
218336322
group 21
 */

public class Menu {

    public int itemId;
    public String itemName;
    public double itemPrice;
    public double total;

    private Menu (Builder builder){
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.itemPrice = builder.itemPrice;
        this.total = builder.total;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getSubtotal() {
        return total;
    }

    public void setSubtotal(double subtotal) {
        this.total = subtotal;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", subtotal=" + total +
                '}';
    }

    public static class Builder{

        public int itemId;
        public String itemName;
        public double itemPrice;
        public double total;

        public  Builder itemId (int itemId){
            this.itemId = itemId;
            return this;
        }

        public  Builder itemName (String itemName){
            this.itemName = itemName;
            return this;
        }
        public  Builder itemPrice (double itemPrice){
            this.itemPrice = itemPrice;
            return this;
        }

        public  Builder total (double total){
            this.total = total;
            return this;
        }
        public Builder copy (Menu menu){

            this.itemId = itemId;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.total = total;

            return this;
        }

        public Menu build(){

            return new Menu(this);
        }

    }
}
