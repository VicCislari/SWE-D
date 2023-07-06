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

    public Lender registerUser(String fullname, String password, String address, String phoneNumber)
    {
        Lender lender = new Lender(fullname, password, address, phoneNumber);
        lenders.add(lender);
        return lender;
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

    // TODO: implement - Deniz
    public boolean authenticateUser(String fullname, String password) {
        return false;
    }
}
