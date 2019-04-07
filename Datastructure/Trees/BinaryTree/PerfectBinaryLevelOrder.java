import java.util.*;

public class PerfectBinaryLevelOrder {

	// Perfect Binary Tree Specific Level Order Traversal

	public static void perfectBinaryLevelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		System.out.print(root+"  ");
		if(root.getLChild() != null && root.getRChild() != null) {
			q.add(root.getLChild());
			q.add(root.getRChild());
		}
		while(!q.isEmpty()) {
			int count = q.size();
			if(count % 2 != 0) {
				System.out.println("The tree is not a perfect binary tree");
				return;
			}
			while(count > 0) {
				Node target1 = q.remove();
				Node target2 = q.remove();
				System.out.print(target1+"  ");
				System.out.print(target2+"  ");
				if(target1.getLChild() != null) {
					q.add(target1.getLChild());
				}
				if(target2.getRChild() != null) {
					q.add(target2.getRChild());
				}
				if(target1.getRChild() != null) {
					q.add(target1.getRChild());
				}
				if(target2.getLChild() != null) {
					q.add(target2.getLChild());
				}
				count -= 2;
			}
		}
	}

	// This method will not work for nodes upto 31
	public static void perfectBinaryLevelOrderRecur(Node l, Node r) {

		/*if(root1 == null || root2 == null) {
			return;
		}
		if(root1.getLChild() == null || root2.getLChild() == null) {
			return;
		}
		
		perfectBinaryLevelOrderRecur(root1.getLChild(), root2.getRChild());
		perfectBinaryLevelOrderRecur(root1.getRChild(), root2.getLChild());
		System.out.print(root1.getLChild()+" ");
		System.out.print(root2.getRChild()+" ");
		System.out.print(root1.getRChild()+" ");
		System.out.print(root2.getLChild()+" ");*/
	}

	public static void perfectBinaryLevelOrderRecur(Node root) {
		
		int height = Height.height(root);
		for(int h = height; h > 1; h--)
		{
			hPrintBST(root.getLChild(), root.getRChild(), h, 2);
		}
		System.out.print(root.getData()+" ");
	}

	public static void hPrintBST(Node left, Node right, int level, int Clevel) {
		if(level < Clevel) {
			return;
		}
		if(level == Clevel)
		{ 
			System.out.print(left.getData()+" ");
			System.out.print(right.getData()+" ");
			return;
		}
		
		if(left.getLChild() != null && right.getRChild() != null) {
			hPrintBST(left.getLChild(), right.getRChild(), level, Clevel + 1);
		}
		if(left.getRChild() != null && right.getLChild() != null) {
			hPrintBST(left.getRChild(), right.getLChild(), level, Clevel + 1);
		}
	}


}