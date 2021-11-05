package utils;

import people.Student;
import java.util.Comparator;

public class StudentComparator  implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if  (o1.getSurname().charAt(0)  >  o2.getSurname().charAt(0))  { return  1; }
        if  (o1.getSurname().charAt(0)  <  o2.getSurname().charAt(0))  { return  -1; }
        return  0;
    }
}
