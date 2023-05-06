import java.util.*;

public class Lender {
    public Lender(String fullname, String password, String lenderId, 
        String address, String phoneNumber) 
    {
        this.fullname = fullname;
        this.password = password;
        this.lenderId = lenderId;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    // this should probably be removed as LenderManagement handles the 
    // Lender objects
    public boolean deleteAccount(){
        return false;
    }
    
    // we have returnCopy in ReservationManagement but no reserveCopy
    public boolean reserveCopy(){
        return false;
    }
    
    // commented so that it can compile on my machine, remove comments once
    // the rest of the system is ready
    /* 
    public ArrayList<Rental> viewMyRentals(){
        return reservationManagement.viewRentals(this);
    }
    */
  
    public String getFullname() {
        return fullname;
    }
  
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getPassword() {
        return password;
    }
  
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getLenderId() {
        return lenderId;
    }
  
    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }
  
    public String getAddress() {
        return address;
    }
  
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Fullname: " + fullname + "\nPassword: " + password + 
            "\nLender ID: " + lenderId + "\nAddress: " + address + 
            "\nPhone number: " + phoneNumber + '\n';
    }
    
    private String fullname;
    private String password;
    private String lenderId;
    private String address;
    private String phoneNumber;
}
