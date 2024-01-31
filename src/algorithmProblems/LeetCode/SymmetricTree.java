package algorithmProblems.LeetCode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return same(root, root);

    }

    public boolean same(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && same(p.right, q.left) && same(p.left, q.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
