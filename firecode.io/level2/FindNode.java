/*
Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.

Example:
       1
      / \
     2   3
    / \ / \
   4  5 6  7

findNode(root, 5) ==> 5


Note: Return null, if desired node is not found.
*/

public TreeNode findNode(TreeNode root, int val) {
     if (root == null) return null;
    LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
    	TreeNode curr = queue.get(0);
    	queue.remove(0);
    	if (curr.data == val) return curr;
        TreeNode left = curr.left;
        TreeNode right = curr.right;
    	if (left != null) queue.add(left);
    	if (right != null) queue.add(right);
    }

    return null;


}
