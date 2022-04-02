package za.ac.cput.factory;

/* BookingPriceFactoryTest.java
   Entity for the BookingPriceFactoryTest
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.BookingPrice;

import static org.junit.jupiter.api.Assertions.*;

class BookingPriceFactoryTest {

    @Test
    public void createBooking(){
        BookingPrice bookingPrice = BookingPriceFactory.createBooking("01213456",600,"002", 0001);
        System.out.println(bookingPrice);
        assertNotNull(bookingPrice);
    }

}