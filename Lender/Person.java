package Lender;

import java.time.LocalDate;

public class Person {
    private int Age;
    private LocalDate Birthday;

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        assert (birthday.isBefore(LocalDate.now())): "pre-condition failed. Birthday in future";
        Birthday = birthday;
        assert (Birthday == birthday): "post-condition failed. Birthday not set correctly";
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {

        assert (age > 0): "pre-condition failed. Age is invalid";
        Age = age;
        assert (Age == age): "post-condition failed. Age not set correctly";

    }
}
