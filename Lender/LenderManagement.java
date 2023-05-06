package Lender;
//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;
import java.util.*;

//done

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

    public void createLender(String fullname, String password, String lenderId, String address, String phoneNumber)
    {
        lenders.add(
            new Lender(fullname, password, lenderId, address, phoneNumber));
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
  
    public void deleteLender(String lenderId) {
        Iterator<Lender> it = lenders.iterator();
        while (it.hasNext()) {
            if (it.next().getLenderId().equals(lenderId)) {
                it.remove();
            }
        }
    }
  
    // prospective login system
    public boolean login(String lenderId, String password) { 
        return false;
    }
    
}
