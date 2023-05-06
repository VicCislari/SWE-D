//importing the packages
package Inventory;

import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;

public class InventoryManagement {
    
    private Copy[] copies;

    public Copy[] getCopies() {
        return this.copies;
    }

    public void setCopies(Copy[] copies) {
        this.copies = copies;
    }

    public void createCopy(Title title){
        Copy copy = new Copy("1", "1", false, title);
        addCopy(copy);
    }
    
    private void addCopy(Copy newCopy) {
        Copy[] newCopies = new Copy[copies.length + 1];
        for (int i = 0; i < copies.length; i++) {
            newCopies[i] = copies[i];
        }
        newCopies[copies.length] = newCopy;
        copies = newCopies;
    }





}
