import jdk.nashorn.api.tree.Tree;

public class BinaryTree {

    private TreeNode root;
    private int size;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data){
            this.data = data;
        }

        private void addTreeNode(TreeNode treeNode) {
            if (treeNode.data< this.data) {
                if (this.left == null) {
                        this.left = treeNode;
                        }
                        this.left.addTreeNode(treeNode);
            } else if (treeNode.data > this.data){
                if (this.right == null) {
                    this.right = treeNode;
                }else{
                    this.right.addTreeNode(treeNode);
                }
            }
        }

        private boolean findTreeNode(int value){
            if (value == this.data) {
                return true;
            } else if (value < this.data) {
                if(this.left == null){
                    return false;
                }else{
                    return this.left.findTreeNode(value);
                }
            } else if (value > this.data) {
                if(this.right == null){
                    return false;
                }else{
                    return this.right.findTreeNode(value);
                }
            }
            return false;
        }

        private int findTreeNodeMax(TreeNode treeNode){
            TreeNode next = treeNode;
            while(next.right != null){
                next = next.right;
            }
            return next.data;
        }

        private int findTreeNodeMin(TreeNode treeNode){
            TreeNode next = treeNode;
            while(next.left != null){
                next = next.left;
            }
            return next.data;
        }
    }


    BinaryTree(){
        this.root = null;
    }

//    BinaryTree(BinaryTreeNode root){
//        this.root = root;
//    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }


    public void add(int value){
        TreeNode treeNode = new TreeNode(value);

        if(this.root == null){
            this.root = treeNode;
        }else{
            this.root.addTreeNode(treeNode);
        }

    }


    public boolean exists(int value) {
        return root.findTreeNode(value);
    }

    public Integer max() {
        //handle the empty tree here
        if(this.root == null){
            return null;
        }
        return this.root.findTreeNodeMax(this.root);

    }

    public Integer min() {
        if(this.root == null){
            return null;
        }
        return this.root.findTreeNodeMin(this.root);
    }


    public static void main(String[] args){

    }


}
