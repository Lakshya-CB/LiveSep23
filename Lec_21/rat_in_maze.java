package Lec_21;

import java.util.Scanner;

public class rat_in_maze {
	static boolean ans = false;

	public static void main(String[] args) {
//	5 4
//	OXOO
//	OOOX
//	OOXO
//	XOOO
//	XXOO
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		char[][] board = new char[r][];
		for (int i = 0; i < r; i++) {
			String str = scn.next();
			board[i] = str.toCharArray();
		}
		chal(0, 0, board);
		if(ans==false) {
			System.out.println(-1);
		}
	}

	public static void chal(int r, int c, char board[][]) {
		if (ans == true || r == board.length || c == board[0].length || board[r][c] == 'X') {
			return;
		}
		if (r == board.length - 1 && c == board[0].length - 1) {
			
			ans = true;
			board[r][c] = '1';  //cheeky!!
            print(board);
//			System.out.println("================");
			return;
		}
		board[r][c] = '1';
		chal(r, c + 1, board);
		chal(r + 1, c, board);
		board[r][c] = '0';
	}

	public static void print(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
                if(ch=='1'){
				System.out.print(ch + " ");
			    }else{
                System.out.print(0 + " ");
			        
                }
            }
			System.out.println();
		}
	}
}
