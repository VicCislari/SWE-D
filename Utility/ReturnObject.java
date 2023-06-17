package Utility;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDate;

import Catalogue.*;
import Lender.*;
import Rental.*;

public class ReturnObject{
    private Rental rental;
    private Reservation reservation;
    private boolean rentalSet = false;
    private boolean reservationSet = false;

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public boolean isRentalSet() {
        return rentalSet;
    }

    public void setRentalSet(boolean rentalSet) {
        this.rentalSet = rentalSet;
    }

    public boolean isReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(boolean reservationSet) {
        this.reservationSet = reservationSet;
    }
}