package people;

import java.util.Calendar;

public class Human {
    String name;
    String surname;
    Calendar calendarBirth;

    public Human() {
    }

    @Override
    public String toString() {
        return "people.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", calendarBirth=" + calendarBirth +
                '}';
    }
}
