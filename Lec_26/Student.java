package Lec_26;

public class Student {
//	data members!! 
	String Name;
	private int Age;

	public Student() {

	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) throws Exception {
		if(Age<0) {
//			return;
//			throw new RuntimeException("mat kar bhai, pitai hogi"); // unchecked
			throw new Exception("boiii kaam kar");
		}
		this.Age = Age;
	}

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public void Intro() {
		System.out.println("===" + this);
		System.out.println("My name is " + Name + " Age is " + Age);
	}

	public void Party(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}
}
