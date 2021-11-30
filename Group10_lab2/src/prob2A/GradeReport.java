package prob2A;

import java.util.ArrayList;

public class GradeReport {
	
	private Student st;
	private String grade;

	GradeReport(Student student) {
		this.st = student;
	}
		
	public Student getSt() {
		return st;
	}

	public String getGr() {
		return grade;
	}
	
	public void setGr(String grade) {
		this.grade = grade;
	}

}
