package Rental;
//import Inventory.*;
//import Title.*;
import Catalogue.*;
import Lender.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class RentalManagement {

    //private Rental[] rentals;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    //private Rental[] reservations;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public RentalManagement() {}//useless

    public ArrayList<Rental> getRentals() {
        return this.rentals;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    /* public boolean reserveCopy(Lender lender, Title title, InventoryManagement inventoryManagement, TitleManagement titleManagement){
        //todo check if title exists
        if(titleManagement.findTitleByISBN(title.getISBN()) != null){
            //todo: check if copies available
            if()
        }
        return false;
    } */

    public void checkNextRental(Title title){
        //an intelligent way to search
        System.out.println("checkingNextRental \n");
    }

    public Rental rentBook(Lender lender, Copy copy, LocalDate rentalDate, LocalDate returnDate){
        Rental rental = new Rental(lender, copy, rentalDate, returnDate);
        addRental(rental);
        return rental;
    }

    private void addRental(Rental rental) {
        rentals.add(rental);
    }

    //TODO
    public void viewRentalsofLender(Lender lender){
        System.out.println("viewRentals \n");
        for(int i =0; i<rentals.size();i++){
            System.out.println(rentals.get(i).getLender().getFullname() + "\n");
        }
    }

    public void viewRentals(){
        System.out.println("viewRentals \n");
        for(int i =0; i<rentals.size();i++)
            System.out.println(rentals.get(i).getLender().getFullname());
    }

    //TODO:
    public void viewRentals(Lender lender){
        System.out.println("viewRentals \n");
        for(int i =0; i<rentals.size();i++)
            System.out.println(rentals.get(i).getLender().getFullname());
    }

    public void viewReservations(){
        System.out.println("viewReservations \n");
        for(int i =0; i<reservations.size();i++)
            System.out.println(reservations.get(i).getLender().getFullname());
    }

    //TODO:
    public void viewReservations(Lender lender){
        System.out.println("viewReservations \n");
        for(int i =0; i<reservations.size();i++)
            System.out.println(reservations.get(i).getLender().getFullname());
    }

    public void returnBook(Rental rental){
        System.out.println("returning Copy: \n");
        //delete from rentals.
        for (int i=0; i< rentals.size(); i++) {
            if (rentals.get(i) == rental) {
                rentals.remove(i);
                break;
            }
        }
    }

    public boolean checkThroughReservations(Rental rental){
        System.out.println("checkThroughReservations \n");
        //Rental reservation = new Rental();
        //TODO: here I must check through the resevations and alert the system that today the following reservations have reached the awaitedPickupDate
        return false;
    }

    public Reservation generateReservation(Title title, Lender lender, LocalDate awaitedPickUp){
        Reservation reservation = new Reservation(awaitedPickUp, lender, title);
        reservations.add(reservation);
        System.out.println("reservations_size: " + reservations.size());
        return reservation;
    }

    //TODO: implement
    public void extendRental(Rental rental, LocalDate returnDate){
        System.out.println("extendRental()");
    }

    //TODO: implement
    public boolean deleteReservation(Reservation reservation, Lender lender){
        System.out.println("deleteReservation");
        return false;
    }

    public String remindUser(Rental rental){
        //will only be executed if the rental is close to expiration.
        return "reminding User to return the copy";
    }

}




























































