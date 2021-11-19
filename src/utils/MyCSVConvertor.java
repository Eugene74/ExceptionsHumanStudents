package utils;

import people.Student;

public class MyCSVConvertor implements CSVConverter{
    public MyCSVConvertor() {
    }

    @Override
    public String toCSVString(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(student.getName()).append(";").append(student.getSurname()).append(";").append(student.getCalendarBirthCSV());
        return stringBuilder.toString();
    }

    @Override
    public Student fromCSVString(String str) {
        String[] csvArr = str.split(";");
        String[] dataBirth = csvArr[2].split(" ");
        Student student = new Student(csvArr[0], csvArr[1], Integer.parseInt(dataBirth[2]),
                Integer.parseInt(dataBirth[1]), Integer.parseInt(dataBirth[0]));
        return student;
    }
}
