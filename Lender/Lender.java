package Lender;
//importing the packages

public class Lender {
    private String fullname;
    private String password;
    private String lenderId;
    private String address;
    private String phoneNumber;

    public Lender(String fullname, String password, String lenderId, 
        String address, String phoneNumber) 
    {
        this.fullname = fullname;
        this.password = password;
        this.lenderId = lenderId;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
  
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

    // this should probably be removed as UserManagement handles the
    // Lender objects
    //to be removed
    /* public boolean deleteAccount(String lenderID){
        UserManagement->deleteAccount(lenderID);
        return false;
    }
    */

    
    /* // we have returnCopy in ReservationManagement but no reserveCopy
    public boolean reserveCopy(Title title){
        //Deniz: check ob titel überhaupt verfügbar.
        
        System.out.println();
        return false;
    } */
    
    // commented so that it can compile on my machine, remove comments once
    // the rest of the system is ready
    
}
