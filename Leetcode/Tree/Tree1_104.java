/*
LeetCode 104 — Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

*/

class node{
    int data; 
    node left;
    node right;

    node(int n){
        this.data=n;
        this.left=null;
        this.right=null;
    }

}

public class Tree1_104{
    public int maxdepth(node root){
        if(root==null) return 0;

        int leftNode=maxdepth(root.left);
        int rightNode=maxdepth(root.right);

        return 1+Math.max(leftNode, rightNode);

    }
    public static void main(String[] args) {
        
    }
}

/*
Complexity:
Time  → O(n)
Space → O(h)

where h is the height of the tree.
*/
