package people;
/*

1. Создайте класс описывающий человека (создайте метод выводящий информацию о человеке)
2. На его основе создайте класс студент (переопределитеметод вывода информации)
3. Создайте класс группа — который содержит массив из 10объектов класса студент.
    Реализуйте методы добавлениястудента и метод  поиска студента по фамилии.
    В случае попытки добавления 11 студента создайте собственное исключение и обработайте его.
4. * Нарисуйте UML диаграмму проекта

*/


import java.util.Calendar;
import java.util.Date;

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
