package utils;

import people.Student;

public interface CSVConverter {
    String toCSVString();
    Student fromCSVString(String str);
}
