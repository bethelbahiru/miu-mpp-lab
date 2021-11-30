package external;

import prob2A.Student;
import prob2A.GradeReport;

public class Main {
	
	public static void main(String[] args) {
		Student st = new Student("Bob");
		st.getGrades().setGr("12");

		System.out.println("Bob's grade: " + st.getGrades().getGr());
		
	
		GradeReport gradeReport = st.getGrades();
		System.out.println("Owner of grade: " + gradeReport.getSt().getName());

	}

}
