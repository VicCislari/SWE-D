import java.time.LocalDateTime;

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


}
