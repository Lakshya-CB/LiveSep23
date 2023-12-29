package Lec_26;

public class client_2 {
	public static void main(String[] args) {
		Student s = new Student("Chottu", 12);

		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
			e.printStackTrace();
//			System.err.println("~~~~~~~~~~~~~~~~~" + e.getMessage());
			System.err.println(e.getMessage() + "???");
			return;
//		}
		} finally {
			System.out.println("-=-=-=-");
			System.out.println("LOLO");
			int I = 10;
			System.out.println(I + 2);
			System.out.println(ll());
		}
	}

	public static int ll() {
		try {
			return 10;
		} finally {
			System.exit(0);
			return 100;
		}
	}

}
