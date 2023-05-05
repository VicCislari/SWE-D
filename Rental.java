public class Rental {
    
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private LocalDateTime reservedOn;
    private Lender lender;
    private Copy copy;  

    public LocalDateTime GetRentalDate(){
        return this.rentalDate;
    }
    public void SetRentalDate ( rentalDate){
            this.rentalDate = rentalDate;
    }

    
    public LocalDateTime GetReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

       public LocalDateTime GetReservedOn() {
        return this.reservedOn;
    }

    public void setReturnDate(LocalDateTime reservedOn) {
        this.reservedOn = reservedOn;
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
