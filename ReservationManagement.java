import java.time.LocalDate;

import Inventory.Copy;
import Title.Title;

class ReservationManagement {
    private Rental[] rentals;
    private Reservation[] reservations;

    public ReservationManagement() {
        System.out.println("created Reservationmanagement \n");
    }

    public Rental[] getRentals() {
        return this.rentals;
    }

    public void setRentals(Rental[] rentals) {
        this.rentals = rentals;
    }

    public Reservation[] getReservations() {
        return this.reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public boolean generateReservation(Lender lender, Rental rental){
        System.out.println("generating Reservation \n");
        return false;
    }

    public Rental checkNextRental(Title title){
        System.out.println("checkingNextRental \n");
        Rental rental = new Rental();
        return rental;
    }

    public boolean generateRental(Lender lender, Copy copy, LocalDate rentalDate, LocalDate returnDate){
        System.out.println("generateRental \n");
        return false;
    }

    public Rental[] viewRentals(Lender lender){
        System.out.println("viewRentals \n");
        Rental[] rentals;
        rentals = new Rental[2];
        return rentals;
    }

    public boolean returnCopy(Rental rental){
        System.out.println("returnCopy \n");
        return false;
    }

    public Reservation checkThroughReservations(Rental rental){
        System.out.println("checkThroughReservations \n");
        Reservation reservation = new Reservation();
        return reservation;
    }

}
