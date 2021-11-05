package utils;

import people.Student;

public interface CSVConverter {
    public  String  toCSVString();
    public Student fromCSVString  (String  str);
}
