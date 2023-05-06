import java.time.LocalDate;
import Copy.Copy;
import Title.Title;
import Lender.Lender;
import Reservation.Reservation;


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
        
        lenderManagement.createLender(
            "Dima", 
            "1234", 
            "L0001", 
            "Real-address-straße", 
            "+49 1234567890"
        );

        lenderManagement.createLender(
            "Vova", 
            "4321", 
            "L0002", 
            "Fake-address-straße", 
            "+49 0987654321"
        );

        lenderManagement.createLender(
            "Boris", 
            "9876", 
            "L0003", 
            "Any-address-straße", 
            "+49 6574839190"
        );
    
        Lender lender = lenderManagement.searchLender("L0002");
        if (lender != null) {
            System.out.println("Found lender! Fullname: " + 
                lender.getFullname());
        }

        lenderManagement.deleteLender("L0001");

        Iterator<Lender> it = lenderManagement.getLenders().iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
