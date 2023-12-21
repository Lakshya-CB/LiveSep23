package Lec_24;

public class Student {
//	data members!! 
//	data parsing!!
	String Name = "Ghum shuda";
	int Age = 0;

	public Student(int Age) {	
		this.Age = Age;
	}
	public Student(String Name) {	
		this.Name = Name;
	}
	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	public Student() {
		this("jaadu",10);
	}
	
	public void Intro() {
//		System.out.println("===" + this);
		System.out.println("My name is " + Name + " Age is " + Age);
	}

	public void Party(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
}
