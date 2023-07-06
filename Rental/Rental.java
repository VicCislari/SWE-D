package Rental;
//importing the packages
//import Inventory.*;
//import Title.*;
import Catalogue.*;
import Lender.*;
import java.time.LocalDate;

public class Rental {
    
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private Lender lender;
    private Copy copy;

    public Rental(Lender lender, Copy copy, LocalDate rentalDate, LocalDate returnDate) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.lender = lender;
        this.copy = copy;
    }

    public LocalDate GetRentalDate(){
        return this.rentalDate;
    }

    public void SetRentalDate (LocalDate rentalDate){
            this.rentalDate = rentalDate;
    }

    public LocalDate GetReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Lender getLender() {
        return this.lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public Copy getCopy() {
        return this.copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }
}
