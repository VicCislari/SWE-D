//importing the packages
package Inventory;

import java.util.ArrayList;
import java.util.*;
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
        //kann man auch als returnCopy sehen
        newCopy.setRented(false); //weil wieder in Inventory
        copies.add(newCopy);
    }

    public Copy reserveCopy(Title title){
        Copy copy_to_return;
        for (int i=0; i< copies.size(); i++){
            if (copies.get(i).getTitle() == title) {
                copy_to_return = copies.get(i);
                copy_to_return.setRented(true);
                copies.remove(i);
                return copy_to_return;
            }
        }
        return null;
    }
    
}
