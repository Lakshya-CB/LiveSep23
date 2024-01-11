package Lec_Tree;

public class BinaryTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
//		System.out.println(nn.data);
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int max_Dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int self = L + R + 2;
		max_Dia = Math.max(max_Dia, self);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia2(root).Dia;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int self = Ht(nn.left) + Ht(nn.right) + 2;

		int L = Dia(nn.left);
		int R = Dia(nn.right);
		return Math.max(self, Math.max(L, R));
	}

	class Ht_Dia_Pair {
		int Ht = -1;
		int Dia = 0;
	}

	private Ht_Dia_Pair Dia2(Node nn) {
		if (nn == null) {
			return new Ht_Dia_Pair();
		}
		Ht_Dia_Pair L = Dia2(nn.left);
		Ht_Dia_Pair R = Dia2(nn.right);
//		//////////////////
		Ht_Dia_Pair ans = new Ht_Dia_Pair();

		//
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;

		int self = L.Ht + R.Ht + 2;
		ans.Dia = Math.max(self, Math.max(L.Dia, R.Dia));
		return ans;
	}

	public BinaryTree(int[] pre, int[] in) {
		root = createPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int ls = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			ls++;
		}
		nn.left = createPreIn(pre, ps + 1, ps + ls, in, is, f - 1);
		nn.right = createPreIn(pre, ps + ls + 1, pe, in, f + 1, ie);
		return nn;
	}

	int pre_idx;

	public BinaryTree(int[] pre) {
		pre_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (pre_idx >= pre.length || pre[pre_idx] == -1) {
			pre_idx++;
			return null;
		}
		Node nn = new Node(pre[pre_idx]);
		pre_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}
}
