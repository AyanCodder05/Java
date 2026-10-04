/*
101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false
*/

class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int n){
        this.left=null;
        this.right=null;
        this.data=n;
    }
}

class Tree4_101{
    public boolean mirror(TreeNode p, TreeNode q){
        if(p.left==null || q.right==null) return false;
        if(p.left==null && q.right==null) return true;

        if(p.data!= q.data) return false;

        boolean leftSubtree=mirror(p.left, q.right);
        boolean rightSubtree=mirror(p.right, q.left);

        return leftSubtree && rightSubtree;

    }

    public boolean symmetricTree(TreeNode root){
        if(root==null) return true;
        return mirror(root.left, root.right);
    }
}