package Catalogue;

public class Copy {
    // Attributes
    private String storagePlace;
    private boolean rented;
    private Title title;
    // Methods
    public Copy(String storagePlace, boolean rented, Title title){
        this.storagePlace = storagePlace;
        this.rented = rented;
        this.title = title;
    }
    public String getStoragePlace(){
        return storagePlace;
    }
    public void setStoragePlace(String storagePlace){
        this.storagePlace = storagePlace;
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
