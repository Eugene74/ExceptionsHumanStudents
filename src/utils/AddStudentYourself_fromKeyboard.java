package utils;

import myexception.GroupLimitException;
import people.Student;

import java.util.Scanner;

public class AddStudentYourself_fromKeyboard {
    private Group_ofStudent group;

    public AddStudentYourself_fromKeyboard(Group_ofStudent group) {
        this.group = group;
    }

    public String [] addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Student");
        String name = scanner.nextLine();
        System.out.println("Enter SureName of Student");
        String surname  = scanner.nextLine();
        System.out.println("Enter Berth of Student 11.11.2021");
        String birth = scanner.nextLine();
        String [] strings =birth.split("\\.");
        try {
            group.add(  new Student( name, surname, Integer.parseInt(strings[2]) ,
                    Integer.parseInt(strings[1]) , Integer.parseInt(strings[0])) ) ;
        } catch (GroupLimitException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
        return new String[]{name, surname};
    }

    public Group_ofStudent getGroup() {
        return group;
    }
}
