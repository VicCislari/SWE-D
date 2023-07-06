package Utility;

import java.time.LocalDate;

import Catalogue.*;
import Lender.*;
import Rental.*;

public class Utility {

    private RentalManagement rentalManagement;
    private Catalogue catalogue;
    private Rental rental;
    private Reservation reservation;
    private boolean rentalSet = false;
    private boolean reservationSet = false;

    public Utility(RentalManagement rentalManagement, Catalogue catalogue) {
        this.rentalManagement = rentalManagement;
        this.catalogue = catalogue;
    }

    //Getters & Setters:
    public Catalogue getCatalogue() {
        return catalogue;
    }
    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }
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
    public RentalManagement getRentalManagement() {
        return rentalManagement;
    }
    public void setRentalManagement(RentalManagement rentalManagement) {
        this.rentalManagement = rentalManagement;
    }

    //technically I don't even to return anything, because I already will have the Utility as a variable and I can jut access the variables of it.
    public void lenderWantsReservation(Title title, Lender lender){
        //Utility returnObject = new Utility();
        // DONE: reserve 1 copy for lender 1
        // deprecated, replaced by catalogue.rentCopy()
        // Copy reserved = inventoryManagement.rentCopy(title);
        Copy reserved = catalogue.rentCopy(title);
        if (reserved!=null){
            System.out.println("copy available");
            setRentalSet(true);
            setRental(rentalManagement.rentBook(lender, reserved, LocalDate.of(2020, 1, 8), LocalDate.of(2021, 1, 8)));
        }else {
            System.out.println("no copy available");
            setReservationSet(true);
            setReservation(rentalManagement.reserveBook(title, lender, LocalDate.of(2020, 1, 8))); //TODO: change the waitedPickUP to the next possible PickUp date.
        }
        rentalManagement.viewRentals();
        System.out.println("\n");
        rentalManagement.viewReservations();
        System.out.println("-----------------------------");
    }

    //TODO: test
    public char checkISBN(String str) {
        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < str.length(); i++) {
            char digitChar = str.charAt(i);

            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                sum += multiply * digit;
                multiply = (multiply == 1) ? 3 : 1;
            }
        }

        int checkDigit = (10 - (sum % 10)) % 10;
        return (char) (checkDigit + '0');
    }
}