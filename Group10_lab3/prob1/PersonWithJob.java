package lesson3.labs.prob1;

public class PersonWithJob{
	
	private double salary;
	private Person person;

	PersonWithJob(String n, double s) {
		// super(n);
		person = new Person(n);
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}

	public Person getPerson(){
		return person;
	}

	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		//Changed the code to getPersonFirst
		boolean isEqual = this.getPerson().getName().equals(p.getPerson().getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		//PersonWithJob Objects
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

	}


}
