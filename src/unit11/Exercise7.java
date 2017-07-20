package unit11;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		
		for(int i = 0; i < 10; i++){
			students.add(new Student(i));
		}
		System.out.println(students);
		List<Student> sub = students.subList(0, 3);
		System.out.println(sub);
		students.removeAll(sub);
		System.out.println(students);
		Student s1 = new Student(1);
		System.out.println(students.contains(s1));
	}

}
class Student{
	int studentId;
	public Student(int id) {
		// TODO Auto-generated constructor stub
		studentId = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student" + studentId ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.studentId == ((Student)obj).studentId;
	}
}
