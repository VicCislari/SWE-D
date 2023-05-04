import java.time.LocalDateTime;
//Victor
class Main {

  public static void main(String[] args) {
    
    /*
     * TODO: make some example objects
     * 4 Titles
     * 4 copies of 3 titles -> Inventory
     * 5 copies of the 1 title -> Inventory
     * 4 lender accounts -> Lender
     * 2 of the lenders have books {1,2,3} -> Rental story
     * 1 of the lender has book {1,2,3,4} -> Rental story
     * 1 of the lender has book {1,3} -> Rental story
     * need a conflict scenario too. -> Reservation
     * 1 Lender reserves a copy of titles 4
     * 1 Lender reserves a copy of titles 3
     */

    System.out.println("Hello World");
  }
}

class Publisher{}

class Author{}

class Title{
    private String name;
    private String language;
    private Publisher publisher;
    private Author[] authors;
    private int publication_date;
    private String ISBN_10;
    private String ISBN_13;
    private double[] dimensions;
    private int pages;
    private int num_copies;
}

class Copy{
  private String storage_place;
    private String id_copy;
    private boolean rented;
}

class Rental{
  private LocalDateTime rental_date;
  private LocalDateTime return_date;
  private LocalDateTime reserved_on;
}

class Lender{

  private String fullname;
  private String id_lender;
  private String address;
  private String phone_number;
  private LocalDateTime birth_date;

  public boolean register(){
    return false;
  }
  public boolean delete_Account(){
    return false;
  }
  public boolean view_Books(){
    return false;
  }
  public boolean reserve_Book(){
    return false;
  }
  public boolean view_my_rentals(){
    return false;
  }

}

class Reservation{
  private LocalDateTime awaited_pick_up;

  public boolean make_rent(){
    return false;
  }
}

class Inventory{
  public Title view_Books(){//should be an array of Titles...
    Title title = new Title();
    return title;
  }
}
