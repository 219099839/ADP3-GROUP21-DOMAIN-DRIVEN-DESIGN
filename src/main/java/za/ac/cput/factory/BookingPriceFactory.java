package za.ac.cput.factory;

/* BookingPriceFactory.java
   Entity for the BookingPriceFactory
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import za.ac.cput.entity.BookingPrice;
import za.ac.cput.util.NawaazHelper;

public class BookingPriceFactory {
    public static BookingPrice createBooking(String CustomerId, int deposit_price, String waiterId, int tableId){
        String customerBookingId= NawaazHelper.bookingId();
        BookingPrice bookingPrice = new BookingPrice.Builder().setBookingId(customerBookingId)
                .setCustomerId(CustomerId)
                .setDeposit_price(deposit_price)
                .setWaiterId(waiterId)
                .setTableId(tableId)
                .build();
        return bookingPrice;
    }

}
