package controller;

import view.StudentView;

public class StudentController {
	
	StudentView studentView = new StudentView();
	
	public void createStudent() {
		studentView.createStudent();
	}
	
	public void readStudent() {
		studentView.readStudents();
	}
	
	public void updateStudent() {
		studentView.updateStudent();
	}
	
	public void deleteStudent() {
		studentView.deleteStudent();
	}
}
