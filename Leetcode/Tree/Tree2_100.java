/*

Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false

Complexity:
Time: O(n) — in the worst case, we visit every node.
Space: O(h) — recursion stack, where h is tree height.

*/



class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;

    TreeNode(int n) {
        this.data=n;
        this.left=null;
        this.right=null;

    }
}

public class Tree2_100{
    public boolean sameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q == null) return false;

        if(p.data!=q.data) return false;

        boolean leftNode=sameTree(p.left, q.left);
        boolean rightNode=sameTree(p.right, q.right);

        return leftNode && rightNode;
    }
}