package Lender;
//importing the packages

public class Lender {
    private String fullname;
    private String password;
    private String address;
    private String phoneNumber;

    public Lender(String fullname, String password,String address, String phoneNumber)
    {
        this.fullname = fullname;
        this.password = password;
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
        return "Fullname: " + fullname + "\nPassword: " + password + "\nAddress: " + address +
            "\nPhone number: " + phoneNumber + '\n';
    }
    
}
