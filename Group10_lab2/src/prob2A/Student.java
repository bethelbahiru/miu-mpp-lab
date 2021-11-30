package prob2A;

public class Student {
	
	private String name;
	private GradeReport grades;
	
	public Student(String name) {
		this.name = name;
		grades = new GradeReport(this);
	}

	public String getName() {
		return name;
	}

	public GradeReport getGrades() {
		return grades;
	}
	

}
