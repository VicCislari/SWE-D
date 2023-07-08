import java.time.LocalDate;

import Catalogue.*;
import Lender.*;
import Rental.*;
import Utility.*;
import Utility.MathLib;

public class LibraryManagementSystem {
    //Management
    private static RentalManagement rentalManagement = new RentalManagement();
    private static UserManagement userManagement = new UserManagement();
    private static Catalogue catalogue = new Catalogue();

    //TODO: Utility - perhaps this is a terrible idea...
    //look at how many changes I would have to make in the diagram just to show that I have a utility function...
    //perhaps I should just throw a bunch of other utility functions from other classes into the utility class
    //and instead put lenderwantsreservation in some other class such as RentalManagement.
    private static Utility utility;// = new Utility();
    private static MathLib mathlib;// = new Utility();

    //TODO: optional
    private static void initLibrary(){

    }

    public static void main(String[] args) {

        int x = 16;
        System.out.print(mathlib.floorSqrt(x));

        // Attributes
        LocalDate returnDate = LocalDate.of(2020, 1, 8);
        LocalDate rentalDate = LocalDate.of(2021, 1, 8);

        Lender lender1 = userManagement.registerUser(
                "Dima",
                "1234",
                "Real-address-straße",
                "+49 1234567890");

        Lender lender2 = userManagement.registerUser(
                "Vova",
                "4321",
                "Fake-address-straße",
                "+49 0987654321");

        Lender lender3 = userManagement.registerUser(
                "Boris",
                "9876",
                "Any-address-straße",
                "+49 6574839190");

        String[] authors1 = { "author1", "author2", "author3" };
        String[] authors2 = { "author2", "author3", "author4" };

        catalogue.createBook("title1", "ISBN1", "publisher1", authors1, LocalDate.of(2020, 1, 8));
        catalogue.createBook("title2", "ISBN2", "publisher2",authors2, LocalDate.of(2021, 1, 8)); //funktioniert

        //TODO: maybe change the input field here just to String ISBN_13, instead of requiring such a on-elegant way around it...
        catalogue.addBook(catalogue.searchBook("ISBN1"), "001", false);
        catalogue.addBook(catalogue.searchBook("ISBN1"), "002", false);
        catalogue.addBook(catalogue.searchBook("ISBN1"), "003", false);
        catalogue.addBook(catalogue.searchBook("ISBN2"), "002", false);

        //set up my utilities after I have finished setting up the user and the library
        utility = new Utility(rentalManagement, catalogue);

        utility.lenderWantsReservation(catalogue.searchBook("ISBN1"), lender1);
        utility.lenderWantsReservation(catalogue.searchBook("ISBN2"), lender2);

        //returning copy of title 1 lender 1 -- this is how you return copies
        rentalManagement.returnBook(utility.getRental()); //should work

        catalogue.returnCopy(utility.getRental().getCopy()); // should work

        //some monitoring
        rentalManagement.viewRentals();
        final String ISBN_EXAMPLE = "ISBN1";
        var copies = catalogue.getCopies(catalogue.searchBook(ISBN_EXAMPLE));
        System.out.println("All copies of " + ISBN_EXAMPLE + " (" + 
            copies.size() + "): ");
        for (var copy: copies) {
            System.out.println(copy.getTitle().getTitle());
        }

    }

}
