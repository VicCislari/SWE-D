import java.time.LocalDate;

//importing the packages
import Catalogue.*;
import Lender.*;
import Reservation.*;

/* 
 * functions which work
 * Lender.{search, construct}
 * Copy.{cosntruct}
 * Title{construct}
 * Rental.{}
 * Reservation.{cosntruct}
 * Lendermanagement.{deleteLender()}
 * InventoryManagement.{reserveCopy(title1), createCopy(title), addCopy(copy)} (DEPRECATED)
 * TitleManagement.{createTitle(Strings), findTitleISBN(string)} (DEPRECATED)
 * ReservationManagement.{constructor, }
 * 
 * Done:
 * lender.reserveCopy() -- will be deleted.
 * Titlemanagement.modifyTitle(isbn, commands) -- hier muss der Dima implementieren.
 * the function viewMyRentals() from Lender will be moved to LenderManagement.
 * ReservationManagement.{returnCopy(), reserveCopy()}.
 * create a Reservation and store it in Reservations in ReservationsManagement
 * create a Rental additionally and store it in Rentals in ReservationManagement
 *
 * 
 * 
 */
class ReturnObject{
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

public class LibraryManagementSystem {
    private static ReservationManagement reservationManagement = new ReservationManagement();
    private static LenderManagement lenderManagement = new LenderManagement();
    // deprecated, replaced by Catalogue
    // private static InventoryManagement inventoryManagement = new InventoryManagement();
    // private static TitleManagement titleManagement = new TitleManagement();
    private static Catalogue catalogue = new Catalogue();

    public static void main(String[] args) {

        // Attributes
        LocalDate returnDate = LocalDate.of(2020, 1, 8);
        LocalDate rentalDate = LocalDate.of(2021, 1, 8);

        // should return the lender.
        Lender lender1 = lenderManagement.createLender(
                "Dima",
                "1234",
                "L0001",
                "Real-address-straße",
                "+49 1234567890");

        Lender lender2 = lenderManagement.createLender(
                "Vova",
                "4321",
                "L0002",
                "Fake-address-straße",
                "+49 0987654321");

        Lender lender3 = lenderManagement.createLender(
                "Boris",
                "9876",
                "L0003",
                "Any-address-straße",
                "+49 6574839190");

        String[] authors1 = { "author1", "author2", "author3" };
        String[] authors2 = { "author2", "author3", "author4" };

        //Title title1 = titleManagement.createTitle("title1", "ISBN1", "publisher1", authors1, LocalDate.of(2020, 1, 8));
        //Title title2 = titleManagement.createTitle("title2", "ISBN2", "publisher2",authors2, LocalDate.of(2021, 1, 8)); //funktioniert
        catalogue.createBook("title1", "ISBN1", "publisher1", authors1, LocalDate.of(2020, 1, 8));
        catalogue.createBook("title2", "ISBN2", "publisher2",authors2, LocalDate.of(2021, 1, 8)); //funktioniert

        // deprecated, replaced by catalogue.addBook()
        // inventoryManagement.createCopy(title1);
        // inventoryManagement.createCopy(title2);

        catalogue.addBook("ISBN1", "001", false);
        catalogue.addBook("ISBN1", "002", false);
        catalogue.addBook("ISBN1", "003", false);
        catalogue.addBook("ISBN2", "002", false);

        ReturnObject returnObject = lenderWantsReservation(catalogue.searchBook("ISBN1"), lender1);
        lenderWantsReservation(catalogue.searchBook("ISBN2"), lender2);

        // depracated, replaced by catalogue.getCopies(), scroll down to 
        // see an example 
        // inventoryManagement.viewAllCopies();

        //returning copy of title 1 lender 1 -- this is how you return copies
        reservationManagement.returnCopy(returnObject.getRental()); //should work

        // deprecated, replaced by catalogue.returnCopy()
        // inventoryManagement.returnCopy(returnObject.getRental().getCopy()); //should work.
        catalogue.returnCopy(returnObject.getRental().getCopy()); // should work


        //some monitoring
        reservationManagement.viewRentals(); 
        // depracated, replaced by catalogue.getCopies()
        // inventoryManagement.viewAllCopies();
        final String ISBN_EXAMPLE = "ISBN1";
        var copies = catalogue.getCopies(catalogue.searchBook(ISBN_EXAMPLE));
        System.out.println("All copies of " + ISBN_EXAMPLE + " (" + 
            copies.size() + "): ");
        for (var copy: copies) {
            System.out.println(copy.getTitle().getTitle() + " " + 
                copy.getCopyID());
        }

        // BibTex test
        try {
            catalogue.searchBook("ISBN1").generateBibTex("title1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        inventoryManagement.createCopy(title1);

        //DONE: reserve 1 copy for lender 1
        Copy reserved = inventoryManagement.rentCopy(title1);
        Reservation reservation;
        if (reserved!=null){
            Rental rental = reservationManagement.generateRental(lender1, reserved, LocalDate.of(2020, 1, 8), LocalDate.of(2021, 1, 8));
            System.out.println("copy available");
        }else {
            System.out.println("no copy available");
            reservation = reservationManagement.generateReservation(title1, lender1, LocalDate.of(2020, 1, 8)); //TODO: change the waitedPickUP to the next possible PickUp date.
        }

        Copy reserved2 = inventoryManagement.rentCopy(title1);
        Reservation reservation2;
        if (reserved!=null){
            Rental rental2 = reservationManagement.generateRental(lender1, reserved, LocalDate.of(2020, 1, 8), LocalDate.of(2021, 1, 8));
            System.out.println("copy available");
        }else {
            System.out.println("no copy available");
            reservation2 = reservationManagement.generateReservation(title1, lender1, LocalDate.of(2020, 1, 8)); //TODO: change the waitedPickUP to the next possible PickUp date.
        }
        System.out.println(reserved2.getTitle().getTitle());
        */

        /*
         * works:
         * Lender lender4 = lenderManagement.searchLender("L0001");
         * if (lender4 == null) {
         * System.out.println("Found lender! Fullname: " +
         * lender4.getFullname());
         * }
         * 
         * lenderManagement.deleteLender("L0001");
         * Lender lender5 = lenderManagement.searchLender("L0001");
         * if (lender5 != null) {
         * System.out.println("Found lender! Fullname: " +
         * lender5.getFullname());
         * } else {
         * System.out.println("didn't find lenderID:" + " L0001");
         * }
         */

        /*
         * done works:
         * String[] authors1 = { "author1", "author2", "author3" };
         * String[] authors2 = { "author2", "author3", "author4" };
         * Title title1 = titleManagement.createTitle("title1", "ISBN1", "publisher1",
         * authors1, LocalDate.of(2020, 1, 8)); //funktioniert
         * Title title2 = titleManagement.createTitle("title2", "ISBN2", "publisher2",
         * authors2, LocalDate.of(2021, 1, 8)); //funktioniert
         */
        // todo: später
        // System.out.println(titleManagement.modifyTitle("ISBN1","commands").getTitle());
        // reservationManagement.checkThroughReservations(rental);//what does this
        // function do again...?

        // reservationManagement.generateReservation();
        /* lenderManagement.reserveCopy(); */
        // lenderManagement.deleteAccount();
        /*
         * lenderManagement.();
         * lenderManagement.reserveCopy();
         * lenderManagement.reserveCopy();
         * lenderManagement.reserveCopy();
         * lenderManagement.reserveCopy();
         */
    }

    private static ReturnObject lenderWantsReservation(Title title, Lender lender){
        ReturnObject returnObject = new ReturnObject();
        // DONE: reserve 1 copy for lender 1
        // deprecated, replaced by catalogue.rentCopy()
        // Copy reserved = inventoryManagement.rentCopy(title);
        Copy reserved = catalogue.rentCopy(title);
        if (reserved!=null){
            System.out.println("copy available");
            returnObject.setRentalSet(true);
            returnObject.setRental(reservationManagement.generateRental(lender, reserved, LocalDate.of(2020, 1, 8), LocalDate.of(2021, 1, 8)));
        }else {
            System.out.println("no copy available");
            returnObject.setReservationSet(true);
            returnObject.setReservation(reservationManagement.generateReservation(title, lender, LocalDate.of(2020, 1, 8))); //TODO: change the waitedPickUP to the next possible PickUp date.
        }
        reservationManagement.viewRentals();
        System.out.println("\n");
        reservationManagement.viewReservations();
        System.out.println("-----------------------------");

        return returnObject;
    }
}