package utils;

import people.Student;

public interface CSVConverter {
    String toCSVString(Student student);
    Student fromCSVString(String str);
}
