package Lec_23;

public class Student {
//	data members!! 
	String Name;
	int Age;

	public void Intro() {
		System.out.println("===" + this);
		System.out.println("My name is " + Name + " Age is " + Age);
	}

	public void Party(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
}
