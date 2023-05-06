//importing the packages
package Inventory;

import java.util.ArrayList;

import Title.*;

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

    public void returnCopy(Copy copy){
        copy.setRented(false);
        addCopy(copy);
    }

    private void addCopy(Copy newCopy) {
        //kann man auch als returnCopy sehen
        newCopy.setRented(false); //weil wieder in Inventory
        copies.add(newCopy);
    }

    public Copy rentCopy(Title title){
        Copy copy_to_return;

        System.out.println("copy_size:"+copies.size());
        viewAllCopies();
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

    public void viewAllCopies(){
        System.out.println("printing out copies \n");
        for(int i =0; i<copies.size();i++){
            System.out.println(copies.get(i).getTitle().getTitle() + "\n");
        }
    }
    
}
