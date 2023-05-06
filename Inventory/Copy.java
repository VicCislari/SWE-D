package Inventory;
import java.time.LocalDate;
import java.util.*;

import Title.Title;
public class Copy {
    // Attributes
    private String storagePlace;
    private String copyID;
    private boolean rented;
    private Title title;
    // Methods
    public Copy(String storagePlace, String copyID, boolean rented, Title title){
        this.storagePlace = storagePlace;
        this.copyID = copyID;
        this.rented = rented;
        this.title = title;
    }
    public String getStoragePlace(){
        return storagePlace;
    }
    public void setStoragePlace(String storagePlace){
        this.storagePlace = storagePlace;
    }
     public String getCopyID(){
        return copyID;
    }
    public void setCopyID(String copyID){
        this.copyID = copyID;
    }
     public boolean isRented(){
        return rented;
    }
    public void setRented(boolean rented){
        this.rented = rented;
    }
    
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
    //return the title(name) of the copy
    public Title getTitleOfCopy() {
        return this.title;
    }
}
