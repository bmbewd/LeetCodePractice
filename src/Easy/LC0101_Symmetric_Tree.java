package Easy;

public class LC0101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
			return true;
		}
        
        if (root.left == null && root.right == null) {
			return true;
		}
				
		return isSameTree(root.left, root.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
			return true;
		}

		if (p == null && q != null) {
			return false;
		}

		if (p != null && q == null) {
			return false;
		}
		
		if (p.val == q.val) {
			return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
		}

		return false;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
