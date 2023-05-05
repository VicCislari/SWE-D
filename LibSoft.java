import java.time.LocalDate;
//
public class LibSoft {
    private static ReservationManagement reservationManagement = new ReservationManagement();

    public static void main(String[] args){
        System.out.println("testing LibSoft");
        Reservation reservation = new Reservation();
        Rental rental = new Rental();
        Lender lender = new Lender();
        Copy copy = new Copy();
        Title title = new Title();
        LocalDate returnDate =  LocalDate.of(2020, 1, 8);
        LocalDate rentalDate =  LocalDate.of(2021, 1, 8);

        reservationManagement.generateReservation(lender, rental);
        reservationManagement.checkNextRental(title);
        reservationManagement.generateRental(lender, copy, rentalDate, returnDate);
        reservationManagement.viewRentals(lender);
        reservationManagement.returnCopy(rental);
        reservationManagement.checkThroughReservations(rental);//what does this function do again...?
        
    }
}
