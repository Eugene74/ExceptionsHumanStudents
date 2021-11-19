/*
Домашнее задание
1. Создайте класс описывающий человека (создайте метод
выводящий информацию о человеке)
2. На его основе создайте класс студент (переопределите
метод вывода информации)
3. Создайте класс группа — который содержит массив из 10
объектов класса студент. Реализуйте методы добавления
студента и метод поиска студента по фамилии. В случае
попытки добавления 11 студента создайте собственное
исключение и обработайте его.
4. * Нарисуйте UML диаграмму проекта

Задание для самостоятельной проработки.
Основной уровень.
1) Дополните реализацию группы Студентов (задание прошлой лекции) возможностью сортировки
массива студентов по фамилии. Для этого в класс Группа добавьте метод
sortStudentsByLastName().
2)Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры
(имя, фамилии и т. д.). Создание и возврат студента на основе считанных данных. Используете
методы этого класса для считывания и добавления студента в группу.

Задание для самостоятельной проработки.
Продвинутый уровень.
1) Объявите интерфейс
public interface CSVConverter{
public String toCSVString();
public Student fromCSVString (String str);
}
//todo Класс Студент должен реализовывать этот интерфейс. ( так у меня и бло, но Ваня сказал, что так нельзя - я переделал)
Логика реализации следующая — на
основе Студента создать строку с его CSV представлением и наоборот на основе этой строки
создать Студента.
* */

import myexception.GroupLimitException;
import myexception.NoExistStudentException;
import people.Student;
import utils.AddStudentYourselfKeyboard;
import utils.MyCSVConvertor;
import utils.StudentsGroup;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("--------------------добавим в группу студентов----------------------------");
        StudentsGroup group = new StudentsGroup(10);
        try {
            group.add(new Student("Kolya", "Saychuk", 1975, 5, 15));
            group.add(new Student("Gena", "Saychuk", 1976, 7, 16));
            group.add(new Student("Seva", "Evgienko", 1986, 3, 11));
            group.add(new Student("Vasya", "Pupko", 1988, 4, 12));
            group.add(new Student("Tolya", "Avko", 1989, 5, 13));
            group.add(new Student("Olya", "Blavko", 1991, 6, 14));
        } catch (GroupLimitException e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
        System.out.println("---------------------найдём по фамилии или имени---------------------------");
        Student student = null;
        try {
            student = group.find("Saychuk");
            System.out.println(student.getName());
            System.out.println(student.getCalendarBirth());
            System.out.println(student.toString());
        } catch (NoExistStudentException e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
        try {
            student = group.find("Seva");
            System.out.println(student.getName());
            System.out.println(student.getCalendarBirth());
            System.out.println(student.toString());
        } catch (NoExistStudentException e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
        System.out.println("--------------------с клавиатуры добавим студента----------------------------");
        AddStudentYourselfKeyboard keyboard = new AddStudentYourselfKeyboard(group);
        keyboard.addNewStudent();

        System.out.println("--------------------отсортируем группу----------------------------");
        Student[] listStudent = group.sortStudentsByLastName();
        for (Student value : listStudent) {
            if (value != null) {
                System.out.println(value);
            } else {
                System.out.println("vacant ");
            }
        }
        System.out.println("---------------------загоним студента в CSV и достанем его из этого файла----------");
        MyCSVConvertor myCSVConvertor = new MyCSVConvertor();
        String csvStudent = myCSVConvertor.toCSVString(student);  // student.toCSVString();
        System.out.println(csvStudent);
        Student fromCSVstudent = myCSVConvertor.fromCSVString(csvStudent); //.fromCSVString(csvStudent);
        System.out.println(fromCSVstudent);
    }
}
