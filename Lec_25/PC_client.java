package Lec_25;

public class PC_client {

	public static void main(String[] args) {
//		P obj1 = new P(); // c1
//		System.out.println(obj1);
//		obj1.
		C obj2 = new C(); // c2
//		System.out.println(obj2);
//		System.out.println(obj2.datac);
//		System.out.println(obj2.data);
//		System.out.println("==================");
		
		obj2.fun();
		System.out.println("==================");
//		obj2.funC();
//		obj2.funP();

//		obj2.
		P obj3 = new C(); // c3
//		obj3.
		obj3.fun();
		((C)obj3).fun();
		System.out.println(obj3);
		System.out.println(obj2);
//		obj3.
		
		Object x = new C();
		Object obj0 = new P();
		
		
//		((C)obj3).funC();
//		obj3.funP();
//		System.out.println(obj3);
//		System.out.println(obj3.datap);
//		System.out.println(obj3.data);
//		System.out.println(((C)obj3).data);
////		collision of data members is resolved wrt
////		LHS, type of your variable!!
//		
//		System.out.println("==================");

//		obj3.
//		C obj4 = new P(); // c4
//		obj4.data = 10;
//		obj4.datac = 10;

//		C obj1 = new C();
////		System.out.println(obj1.data);
////		P obj1 = new P(); // C1
//		System.out.println(obj1.data);
//		System.out.println(obj1.datac);
//		System.out.println("==============");
////		///////////
//		P obj2 = new C();
//		System.out.println(obj2.data);
//		System.out.println(obj2.datap);
//		System.out.println(((C)obj2).data);
//		System.out.println(((C)obj2).datac);
//		obj2.fun();
//		((C)obj2).fun();
//		
//		
////		System.out.println("==============");
//////		///////////
////		C obj3 = new C();
////
////		System.out.println(obj3.data);
////		System.out.println(((P)obj3).data);
//	/////////////////////////////
////error: can't typecast from C to P		C obj4 = new P();

	}

}
