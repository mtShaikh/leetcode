/*
Given the root node of a Binary Tree, determine if it is a Binary Search Tree.

Examples:


          20
        /   \
      15    30
     /  \
    14  18

    output ==> true

          20
         /   \
       30    15
      /  \
     14  18

   output ==> false
*/
public static boolean validateBST(TreeNode root) {
    return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

private static boolean isValidBST(TreeNode p, int min, int max){
    if(p==null)
        return true;

    if(p.data <= min || p.data >= max)
        return false;

    return isValidBST(p.left, min, p.data) && isValidBST(p.right, p.data, max);
}
