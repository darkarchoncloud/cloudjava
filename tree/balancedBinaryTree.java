public class balancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
			return false;
		}

		return (isBalanced(root.right) && isBalanced(root.left));
	}

	public int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return (Math.max(getHeight(root.left), getHeight(root.right)) + 1);

	}

	public static void main(String[] args) {
		balancedBinaryTree result = new balancedBinaryTree();
		TreeNode root = TreeNode.reConstruct(new String[] {"3", "2", "1", "#", "#", "#", "5", "4", "#", "#",
        "6","1", "2", "#", "#", "#", "#", "#"});
        System.out.println(result.getHeight(root));
        System.out.println(result.getHeight(root.left));
        System.out.println(result.getHeight(root.right));
        System.out.println(result.isBalanced(root));
	}
}