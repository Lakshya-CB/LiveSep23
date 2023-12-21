package Lec_23;

public class client {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name =  "pappu";
		s1.Age = 8;
		
		
		
		Student s2 = new Student();
		s2.Name = "Bhupender";
		s2.Age = 44;
		
		
//		s1.Party(s2.Name);
		
//		System.out.println("??"+s1);
//		s1.Intro();
//		System.out.println("====================");
//		System.out.println("??"+s2);	
//		s2.Intro();
		s1.Party(s2.Name);
	}
}
