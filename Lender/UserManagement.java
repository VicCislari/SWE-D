package Lender;
//importing the packages
import java.util.*;
import java.util.ArrayList;

public class UserManagement {
    private ArrayList<Lender> lenders;
    
    public ArrayList<Lender> getLenders() {
        return lenders;
    }
    public void setLenders(ArrayList<Lender> lenders) {
        this.lenders = lenders;
    }

    public UserManagement() {
        this.lenders = new ArrayList<Lender>();
    }

    public Lender registerUser(String fullname, String password, String lenderId, String address, String phoneNumber)
    {
        Lender lender = new Lender(fullname, password, lenderId, address, phoneNumber);
        lenders.add(lender);
        return lender; //I guess for future use this function shouldn't return anything, but for current testing we'll keep
    }
    
    public Lender searchLender(String lenderId) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            Lender lender = it.next();
            if (lender.getLenderId().equals(lenderId)) {
                return lender;
            }
        }
        return null;
    }
  
    public boolean deactivateUser(String lenderId) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            if (it.next().getLenderId().equals(lenderId)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean deactivateUser(Lender lender) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            if (it.next().equals(lender)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
  
    // TODO: Deniz
    public boolean authenticateUser(String lenderId, String password) {
        return false;
    }
    
}
