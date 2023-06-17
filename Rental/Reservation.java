package Rental;
//importing the packages
//import Inventory.*;

//import Title.*;
import Catalogue.*;
import Lender.*;
import java.time.LocalDate;

public class Reservation{
    private LocalDate awaited_pick_up;
    private Lender lender;
    private Title title;

    public Reservation(LocalDate awaited_pick_up, Lender lender, Title title) {
        this.awaited_pick_up = awaited_pick_up;
        this.lender = lender;
        this.title = title;
    }

    public LocalDate getAwaited_pick_up() {
        return this.awaited_pick_up;
    }

    public void setAwaited_pick_up(LocalDate awaited_pick_up) {
        this.awaited_pick_up = awaited_pick_up;
    }

    public Lender getLender() {
        return this.lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

  }
