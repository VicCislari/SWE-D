//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;

package Inventory;

public class InventoryManagement {
    

    private Copy[] copies;
    
    public void setCopy() {
        this.copies = new Copy[0];
    }



    public void createCopy(Title title){
        Copy copy = new Copy(null, null, false, title);
        copies.add();
    }





}
