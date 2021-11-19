package people;

import utils.CSVConverter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class Student extends Human  {

    public Student(String name, String surname, int year, int month, int birthday) {
        calendarBirth = Calendar.getInstance();
        calendarBirth.set(year, month, birthday);
        this.name = name;
        this.surname = surname;

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCalendarBirth() {
        return formatBirth();
    }

    public String getCalendarBirthCSV() {
        return formatBirthCSV();
    }

    public void setCalendarBirth(Calendar calendarBirth) {
        this.calendarBirth = calendarBirth;
    }

    @Override
    public String toString() {
        return "people.Student{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", date of birth = '" + formatBirth() +
                '}';
    }

    private String formatBirth() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
        String formatted = format1.format(this.calendarBirth.getTime());
        return formatted;
    }

    private String formatBirthCSV() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
        String formatted = format1.format(this.calendarBirth.getTime());
        return formatted;
    }
}
