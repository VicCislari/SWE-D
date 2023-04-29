import java.time.LocalDateTime;

class Main {
  public static void main(String[] args) {
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

class Lender{}

class Reservation{}
class Inventory{}
