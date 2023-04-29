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

class Copy{}
class Lender{}
class Rental{}
class Reservation{}
class Inventory{}
