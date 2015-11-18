import java.util.*;


public class treeTraversal {
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

	public static void main(String[] args) {
		treeTraversal result = new treeTraversal();
		TreeNode root = TreeNode.reConstruct(new String[] {"3", "2", "1", "#", "#", "#", "5", "4", "#", "#",
        "6", "#", "#"});
        System.out.println(TreeNode.preOrder(root));
        System.out.println(result.preOrder(root).toString());
	}
}