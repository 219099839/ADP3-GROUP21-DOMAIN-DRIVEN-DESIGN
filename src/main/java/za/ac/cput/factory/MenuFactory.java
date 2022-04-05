package za.ac.cput.factory;

import za.ac.cput.Entity.Menu;

public class MenuFactory {

    public static Menu createMenu(int itemId, String itemName, double itemPrice, double total ) {

        return new Menu.Builder().setItemId(itemId)
                .setItemName(itemName)
                .setItemPrice(itemPrice)
                .setTotal(total)
                .build();

    }

}
