package utils;

import myexception.GroupLimitException;
import myexception.NoExistStudentException;
import people.Student;
import utils.StudentComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Group_ofStudent  {
	private static Student[] list;
	private int p = 0;

	public Group_ofStudent(int i) {
		list = new Student[i];
	}

	public void add(Student s) throws GroupLimitException {
		try {
			list[p++] = s;
		} catch (Exception e) {
			p--; // rollback index
			throw new GroupLimitException("Sorry man, but group is full  -- You can`t add another student");
		}
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public Student find(String name) throws NoExistStudentException {
		Student student = null;
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name)|| list[i].getSurname().equalsIgnoreCase(name)){
				student = this.get(i);
			}
		}
		if(student==null) throw new NoExistStudentException("Sorry, but there is no student named "+ name+ " in the group");
		return student;
	}

	public Student [] sortStudentsByLastName() {
		Arrays.sort(list, Comparator.nullsFirst(new StudentComparator()));
		return list;
	}
	public Student[] getList() {
		return list;
	}
}
