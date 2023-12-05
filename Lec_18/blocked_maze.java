package Lec_18;

public class blocked_maze {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean[][] Visited = new boolean[maze.length][maze[0].length];
		chal(0, 0, "", maze, Visited);

	}

	public static void chal(int r, int c, String path, int[][] maze, boolean[][] Visited) {
		if (r == maze.length-1 && c == maze[0].length-1) {
			System.out.println(path);
			return;
		}
//		System.out.println(path);
		if (r < 0 || r >= maze.length || c >= maze[0].length || c < 0 || maze[r][c] == 1 
				|| Visited[r][c] == true) {
			return;
		}
		Visited[r][c] = true;
		chal(r - 1, c, path + "U", maze, Visited);
		chal(r + 1, c, path + "D", maze, Visited);
		chal(r, c - 1, path + "L", maze, Visited);
		chal(r, c + 1, path + "R", maze, Visited);
//		Visited[r][c] = false;
	}
}
