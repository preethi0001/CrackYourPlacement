import java.util.*;
class Solution {

    public boolean isValidBST(TreeNode root) {
        boolean output = check(root, -1*Double.MAX_VALUE, Double.MAX_VALUE);
        return output;
    }
    public boolean check(TreeNode root, double leftMax, double rightMin) {
        if (root == null) {
            return true;
        }
        boolean chkLeft = true;
        boolean chkRight = true;

        if (!(root.left == null) && (root.left.val >= root.val || root.left.val <= leftMax)) {
            chkLeft = false;
        }
        if (!(root.right == null) && (root.right.val <= root.val || root.right.val >= rightMin)) {
            chkRight = false;
        }
        return chkLeft && chkRight && check(root.left, leftMax, root.val) && check(root.right, root.val, rightMin);
    }
}