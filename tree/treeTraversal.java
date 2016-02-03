import java.util.*;


public class treeTraversal {

	public void preOrder1(TreeNode root) {
		if (root == null) {
			return;
		}  else {
			System.out.print(root.key + " ");
			preOrder1(root.left);
			preOrder1(root.right);

		}
		
	}
	public void inOrder1(TreeNode root) {
		if (root == null) {
			return;
		}  else {
			
			inOrder1(root.left);
			System.out.print(root.key + " ");
			inOrder1(root.right);

		}
		
	}

	public void postOrder1(TreeNode root) {
		if (root == null) {
			return;
		}  else {
			
			postOrder1(root.left);
			
			postOrder1(root.right);

			System.out.print(root.key + " ");

		}
		
	}
	public List<Integer> preOrder(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.offerFirst(root);
		while (!stack.isEmpty()) {
			TreeNode current = stack.pollFirst();
			result.add(current.key);
			if (current.right != null) {
				stack.offerFirst(current.right);
			}
			if (current.left != null) {
				stack.offerFirst(current.left);
			}
		}

		return result;

	}

	public List<Integer> inOrder(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}

		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.offerFirst(root);
		TreeNode current = root;

		while (current.left != null) {
			stack.offerFirst(current.left);
            current = current.left;
		}

		while (!stack.isEmpty()) {
			TreeNode cur = stack.pollFirst();
			result.add(cur.key);
			if (cur.right != null) {
				TreeNode temp = cur.right;
				stack.offerFirst(temp);
				while (temp.left != null) {
					stack.offerFirst(temp.left);
					temp = temp.left;

				}
			}
		}

		return result;
	}

	public List<Integer> postOrder(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		Deque<TreeNode> stack1 = new LinkedList<TreeNode>();
		Deque<TreeNode> stack2 = new LinkedList<TreeNode>();

		stack1.offerFirst(root);

		while (!stack1.isEmpty()) {
			TreeNode current = stack1.pollFirst();
			stack2.offerFirst(current);
			if (current.left != null) {
				stack1.offerFirst(current.left);
			}
			if (current.right != null) {
				stack1.offerFirst(current.right);
			}
		}

		while (!stack2.isEmpty()) {
			result.add(stack2.pollFirst().key);
		}



		




		

		return result;
		
	}

	public static void main(String[] args) {
		treeTraversal result = new treeTraversal();
		TreeNode root = TreeNode.reConstruct(new String[] {"3", "2", "1", "#", "#", "#", "5", "4", "#", "#",
        "6", "#", "#"});
        System.out.println(TreeNode.preOrder(root));
        System.out.println(result.preOrder(root).toString());
        System.out.println(result.inOrder(root).toString());
        System.out.println(result.postOrder(root).toString());

        System.out.println("Now the same result in recursion: ");
        System.out.println("Preorder: ");
        result.preOrder1(root);
        System.out.println();
        System.out.println("Inorder: ");
        result.inOrder1(root);
        System.out.println();
        System.out.println("Postorder: ");
        result.postOrder1(root);
        System.out.println();
	}
}