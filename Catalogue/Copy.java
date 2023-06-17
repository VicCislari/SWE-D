package Catalogue;

public class Copy {
    // Attributes
    private String storagePlace;
    private int copyID;
    private boolean rented;
    private Title title;
    // Methods
    public Copy(String storagePlace, int copyID, boolean rented, Title title){
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
    public int getCopyID(){
        return copyID;
    }
    public void setCopyID(int copyID){
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
}
