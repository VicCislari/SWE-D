package Lender;
//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;
import java.util.*;
import java.util.ArrayList;

public class LenderManagement {
    private ArrayList<Lender> lenders;
    
    public ArrayList<Lender> getLenders() {
        return lenders;
    }
    public void setLenders(ArrayList<Lender> lenders) {
        this.lenders = lenders;
    }

    public LenderManagement() {
        this.lenders = new ArrayList<Lender>();
    }

    public Lender createLender(String fullname, String password, String lenderId, String address, String phoneNumber)
    {
        Lender lender = new Lender(fullname, password, lenderId, address, phoneNumber);
        lenders.add(lender);
        return lender;
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
  
    public boolean deleteLender(String lenderId) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            if (it.next().getLenderId().equals(lenderId)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean deleteLender(Lender lender) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            if (it.next().equals(lender)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
  
    // prospective login system
    public boolean login(String lenderId, String password) { 
        return false;
    }
    
}
