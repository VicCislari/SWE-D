public class LibSoft {
    private static ReservationManagement reservationManagement = new ReservationManagement();

    public static void main(String[] args){
        System.out.println("testing LibSoft");
        Reservation reservation = new Reservation();
        Rental rental = new Rental();
        Lender lender = new Lender();
        Copy copy = new Copy();

        reservationManagement.generateReservation(lender, rental);
        

     checkNextRental(Title title)
       
    generateRental(Lender lender, Copy copy, LocalDate rentalDate, LocalDate returnDate)
        

    viewRentals(Lender lender)
       

 returnCopy(Rental rental)
       

   checkThroughReservations(Rental rental)
        
    }
}
