import java.time.LocalDate;
import java.util.*;

//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;

public class LibSoft {
    
    public static void main(String[] args){

        //Attributes
        ReservationManagement reservationManagement = new ReservationManagement();
        LenderManagement lenderManagement = new LenderManagement();
        InventoryManagement inventoryManagement = new InventoryManagement();
        TitleManagement titleManagement = new TitleManagement();
    
        System.out.println("testing LibSoft");
        Reservation reservation = new Reservation();
        
        LocalDate returnDate =  LocalDate.of(2020, 1, 8);
        LocalDate rentalDate =  LocalDate.of(2021, 1, 8);

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
        
        String[] authors1 = { "author1", "author2", "author3" };
        String[] authors2 = { "author2", "author3", "author4" };
        Title title1 = titleManagement.createTitle("title1", "ISBN1", "publisher1", authors1, LocalDate.of(2020, 1, 8)); //funktioniert
        Title title2 = titleManagement.createTitle("title2", "ISBN2", "publisher2", authors2, LocalDate.of(2021, 1, 8)); //funktioniert

        //später
        //System.out.println(titleManagement.modifyTitle("ISBN1","commands").getTitle());
        
        /* ;
        titleManagement.addTitle();
        titleManagement.findTitleByISBN(); */

        //reservationManagement.checkThroughReservations(rental);//what does this function do again...?

        /* 
        done: 
        inventoryManagement.createCopy(title1); 
        */
        
    }
}
