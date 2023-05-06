import java.time.LocalDate;

import Title.Title;

class Reservation{
    private LocalDate awaited_pick_up;
    private Lender lender;
    private Rental rental;
    private Title title;

    public Reservation() {
        System.out.println("created Reservation \n");
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

    public Rental getRental() {
        return this.rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

  }
