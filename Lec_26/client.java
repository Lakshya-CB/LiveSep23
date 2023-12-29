package Lec_26;

public class client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student("pappu", 10);
		System.out.println(s1.getAge());
		s1.setAge(20);
		System.out.println(s1.getAge());
		s1.setAge(-10);
		System.out.println(s1.getAge());
		
//		s1.Age = -10;
//		s1. 

	}
}
