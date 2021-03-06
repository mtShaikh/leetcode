/*
Given a binary tree, write a method to return its size. The size of a tree is the number of nodes it contains.

Examples:
     1
    / \
   2   3     ==>  7
  / \ / \
 4  5 6  7

*/

 public int size(TreeNode root) {
    return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
}
