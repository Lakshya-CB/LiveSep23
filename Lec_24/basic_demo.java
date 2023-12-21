package Lec_24;


public class basic_demo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "A";
		s1.Age = 10;

		Student s2 = s1;
		s2.Name = "Jaadu";
		
		s1.Intro();
		s2.Intro();
	}

}
