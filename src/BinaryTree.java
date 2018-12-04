/*
Assignment: Lab3
Author: Thomas J Kelly
Date: 12/3/18
Description:   Write a binary tree class.
 */



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

        private void printTreeNode(TreeNode treeNode){
            System.out.println("ROOT: ");
            System.out.println(treeNode.data);
            System.out.println("LEFT: ");
            if(treeNode.left != null){
                printTreeNode(treeNode.left);
            }

        }

    }


    BinaryTree(){
        this.root = null;
    }

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
        this.size += 1;

    }


    public boolean exists(int value) {
        if(this.root == null){
            return false;
        }
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

    public void printMe(){

        this.root.printTreeNode(this.root);

//        System.out.println("ROOT: ");
//        System.out.println(this.root.data);
//        System.out.println("LEFT: ");
//        System.out.println(root.left.data);
//        System.out.println("RIGHT: ");
//        System.out.println(root.right.data);
    }


    public static void main(String[] args){

        //test1 create and check size = 0
//        System.out.println("###############################");
//        System.out.println("TEST 1");
//        System.out.println("-------------------------------");
//        BinaryTree test1 = new BinaryTree();
//        System.out.print("IS EMPTY: ");
//        System.out.println(test1.isEmpty());
//
//        //test2 create and add only root
//        System.out.println("###############################");
//        System.out.println("TEST 2");
//        System.out.println("-------------------------------");
//        BinaryTree test2 = new BinaryTree();
//        test2.add(0);
//        System.out.print("IS EMPTY: ");
//        System.out.println(test2.isEmpty());
//        System.out.print("DOES 0 EXIST? ");
//        System.out.println(test2.exists(0));
//
//
//        //TEST3 add to each side of a root node, check size
//        System.out.println("###############################");
//        System.out.println("TEST 3");
//        System.out.println("-------------------------------");
//        BinaryTree test3 = new BinaryTree();
//        test3.add(10);
//        test3.add(5);
//        test3.add(15);
//        System.out.print("SIZE: ");
//        System.out.println(test3.size);
//
//        //TEST4 add two levels of leaves
//        System.out.println("###############################");
//        System.out.println("TEST 4");
//        System.out.println("-------------------------------");
//        BinaryTree test4 = new BinaryTree();
//        test4.add(10);
//        test4.add(5);
//        test4.add(4);
//        test4.add(6);
//        test4.add(15);
//        test4.add(16);
//        test4.add(13);
//        System.out.print("SIZE: ");
//        System.out.println(test4.size);
//        test4.printMe();
//
//        //TEST5 add two layers and test locations
//        System.out.println("###############################");
//        System.out.println("TEST 5");
//        System.out.println("-------------------------------");
//        BinaryTree test5 = new BinaryTree();
//        test5.add(10);
//        System.out.println("ADD 10");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(5);
//        System.out.println("ADD 5");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(4);
//        System.out.println("ADD 4");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(6);
//        System.out.println("ADD 6");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(15);
//        System.out.println("ADD 15");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(16);
//        System.out.println("ADD 16");
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        test5.add(13);
//        System.out.println("ADD 13");
//        System.out.print("SIZE: ");
//        System.out.println(test5.size);
//        System.out.print("MIN: ");
//        System.out.println(test5.min());
//        System.out.print("MAX: ");
//        System.out.println(test5.max());
//        System.out.print("EXISTS: ");
//        System.out.println(test5.exists(20));
//        System.out.print("EXISTS: ");
//        System.out.println(test5.exists(16));
//
//
//        //test1 create and check size = 0
//        System.out.println("###############################");
//        System.out.println("TEST 6");
//        System.out.println("-------------------------------");
//        BinaryTree test6 = new BinaryTree();
//        System.out.print("IS EMPTY: ");
//        System.out.println(test6.isEmpty());
//        System.out.print("EXISTS: ");
//        System.out.println(test6.exists(15));
//        System.out.println("ADDING 15...");
//        test6.add(15);
//        System.out.print("IS SIZE: ");
//        System.out.println(test6.size);
//        System.out.print("15 EXISTS? ");
//        System.out.print(test6.exists(15));

    }


}
