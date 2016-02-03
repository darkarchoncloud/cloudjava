public class symmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isSymmetric(root.left, root.right);
		}
	}

	private boolean isSymmetric(TreeNode root1, TreeNode root2) {
	    if (root1 == null && root2 == null) {
	    	return true;
	    } else if (root1 == null || root2 == null) {
	    	return false;
	    } else {
	    	if (root1.key != root2.key) {
	    		return false;
	    	} else {
	    		return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
	    	}
	    }
	}

	public static void main(String[] args) {
		symmetricTree solution = new symmetricTree();
		TreeNode root = TreeNode.reConstruct(new String[] {"1", "2", "#", "#", "2", "1", "#", "#", "#"});
		boolean result = solution.isSymmetric(root);
		root = TreeNode.reConstruct(new String[] { "2", "1", "3", "#", "#", "4", "#", "#", "1", "4",
        "#", "#", "3", "#", "#" });
       result = solution.isSymmetric(root);

		if (result == false) {
			System.out.println("The tree is not symmetric!");

		} else {
			System.out.println("The tree is symmetric!");
		}
	}
}