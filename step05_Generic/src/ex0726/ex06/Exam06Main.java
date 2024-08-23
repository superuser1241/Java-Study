package ex0726.ex06;

public class Exam06Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.register1( new Applicant<Person>(new Person()) );
		course.register1(new Applicant<Worker>(new Worker()));
		course.register1(new Applicant<Student>(new Student()));
		course.register1(new Applicant<HightStudent>(new HightStudent()));
		course.register1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("-<? super Worker> 인경우 -----------------------------");
		course.register2( new Applicant<Person>(new Person()) );
		course.register2(new Applicant<Worker>(new Worker()));
		//course.register2(new Applicant<Student>(new Student()));
		//course.register2(new Applicant<HightStudent>(new HightStudent()));
		//course.register2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		System.out.println("-<? extends Student> 인경우 -----------------------------");
		//course.register3( new Applicant<Person>(new Person()) );
		//course.register3(new Applicant<Worker>(new Worker()));
		course.register3(new Applicant<Student>(new Student()));
		course.register3(new Applicant<HightStudent>(new HightStudent()));
		course.register3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
