package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @org.junit.jupiter.api.Test
    void getReservationTotal_reservingKingRoom_forOneNightNotWeekend() {
        Reservation reservation1 = new Reservation("King", 1, false);
        assertEquals(139, reservation1.getReservationTotal());
    }

    @org.junit.jupiter.api.Test
    void getReservationTotal_reservingKingRoom_forTwoNightNotWeekend() {
        Reservation reservation1 = new Reservation("King", 2, false);
        assertEquals(278, reservation1.getReservationTotal());
    }
}