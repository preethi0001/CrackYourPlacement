/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void dfs(TreeNode root, List<String> list, StringBuilder sb){
        if(root==null)return;
        int len=sb.length();
        if(root.left==null && root.right==null){
            list.add(sb.append(root.val).toString());
            sb.setLength(len);
            return;
        }
        sb.append(root.val).append("->");
        dfs(root.left, list, sb);
        dfs(root.right, list, sb);
        sb.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(root,list,sb);
        return list;
    }
}