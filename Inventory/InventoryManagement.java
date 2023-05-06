//importing the packages
package Inventory;

import java.util.ArrayList;

import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;

//done
public class InventoryManagement {
    
    //private Copy[] copies;
    private ArrayList<Copy> copies = new ArrayList<Copy>();

    public ArrayList<Copy> getCopies() {
        return this.copies;
    }

    public void setCopies(ArrayList<Copy> copies) {
        this.copies = copies;
    }

    public void createCopy(Title title){
        Copy copy = new Copy("1", "1", false, title);
        addCopy(copy);
    }
    
    private void addCopy(Copy newCopy) {
        copies.add(newCopy);
    }
}
