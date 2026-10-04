/*
226. Invert Binary Tree
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
*/

class treeNode{
    treeNode left;
    treeNode right;
    int data;

    treeNode(int n) {
        this.left=null;
        this.right=null;
        this.data=n;
    }
}

class Tree3_226{
    public treeNode invertTree(treeNode root){
        if(root == null)return root;
        treeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}