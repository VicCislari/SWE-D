package Reservation;
//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;
import java.time.LocalDate;

import java.util.ArrayList;

public class Rental {
    
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private LocalDate reservedOn;
    private Lender lender;
    private Copy copy;  

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

       public LocalDate GetReservedOn() {
        return this.reservedOn;
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
