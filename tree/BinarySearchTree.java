public class BinarySearchTree {
	public boolean isBST(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
	}
}