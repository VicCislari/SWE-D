package Reservation;
import Inventory.*;
import Title.*;
import Lender.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class ReservationManagement {
    //private Rental[] rentals;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    //private Reservation[] reservations;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public ReservationManagement() {
    }

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

    //the user wants a title which is not in store
    private boolean generateReservation(Lender lender, Rental rental){
        System.out.println("generating Reservation \n");
        return false;
    }

/*
    public Rental checkNextRental(Title title){
        System.out.println("checkingNextRental \n");
        Rental rental = new Rental();
        return rental;
    }
*/

    public Rental generateRental(Lender lender, Copy copy, LocalDate rentalDate, LocalDate returnDate){
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
            System.out.println(rentals.get(i).getLender().getFullname() + "\n");
    }

    public void viewReservations(){
        System.out.println("viewReservations \n");
        for(int i =0; i<reservations.size();i++)
            System.out.println(reservations.get(i).getLender().getFullname() + "\n");
    }

    public boolean returnCopy(Rental rental){
        System.out.println("returnCopy \n");
        return false;
    }

    public boolean checkThroughReservations(Rental rental){
        System.out.println("checkThroughReservations \n");
        //Reservation reservation = new Reservation();
        //TODO: here I must checkthrough the resevations and alert the system that today the following reservations have reached the awaitedPickupDate
        return false;
    }

    public Reservation generateReservation(Title title, Lender lender, LocalDate awaitedPickUp){
        Reservation reservation = new Reservation(awaitedPickUp, lender, title);
        reservations.add(reservation);
        System.out.println("reservations_size: " + reservations.size());
        return reservation;
    }

}
