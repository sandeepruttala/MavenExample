package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

public class StudentView {
	
	private List<Student> students;
	private Scanner sc;

	public StudentView() {
		this.students = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	
	public void createStudent() {	// CREATE(C)
		int id;
		String name;
		System.out.println("Enter Student id: ");
		id = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		students.add(new Student(id,name));
	}
	
	public void readStudents() {	//READ(R)
		int i=1;
		for(Student student:students)
		{
			System.out.println("Student-"+i);
			System.out.println("ID: "+student.getId());
			System.out.println("NAME: "+student.getName());
			i++;
		}
		if(i==1)
			System.out.println("No records found");
	}
	
	public void updateStudent(){	// UPDATE(U)
		int id;
		boolean check = false;
		String name;
		System.out.println("Enter id of student to be changed: ");
		id = sc.nextInt();
		System.out.println("Enter a new Name: ");
		name = sc.next();
		for(Student student:students)
		{
			if(student.getId()==id)
			{
				student.setName(name);
				check = true;
				break;
			}
		}
		if(!check)
			System.out.println("Student with id "+id+" is not present in records");
	}
	
	public void deleteStudent() {	// DELETE(D)
		int id;
		boolean check = false;
		System.out.println("Enter id of student to be deleted: ");
		id = sc.nextInt();
		for(Student student:students)
		{
			if(student.getId()==id)
			{
				students.remove(student);
				check=true;
				break;
			}
		}
		if(!check)
			System.out.println("Student with id "+id+" is not present in records");	
	}
	
}
