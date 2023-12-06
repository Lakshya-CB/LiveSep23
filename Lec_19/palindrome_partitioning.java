package Lec_19;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
	public static void main(String[] args) {
		List<String> AL_bad = new ArrayList<>();
		kaat("abcd", "", AL_bad);
	}

	public static void kaat(String table, String bag, List<String> AL_bag) {
		if (table.length() == 0) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("-=-=-=-==-=-=-=-=-");
//			return;//////
		}

//		BP : table = "nitin"
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
//			System.out.println(piece + " - " + remain);
////			Method 1) make your AL behave like a String!!
////			Strings are immutable and concat makes a new string!! 
//			List<String> AL_s = new ArrayList<>(AL_bag);
//			AL_s.add(piece);
//			kaat(remain, bag + "," + piece, AL_s);
			
//			Method 2) Explicit Backtracking!!!
			AL_bag.add(piece); // with 
			kaat(remain, bag + "," + piece,AL_bag);
			AL_bag.remove(AL_bag.size()-1);

		}
	}
}
