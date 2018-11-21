//import jdk.nashorn.api.tree.Tree;

public class BinaryTree {

    private int data;
    private int size;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return true;
    }

    public void add(int value) {
        if (this.isEmpty()) {
            this.data = value;
        } else {
            if (value < this.data) {
                if (this.left == null) {
                    this.left = new BinaryTree();
                }
                this.left.add(value);
            } else {
                if (this.right == null) {
                    this.right = new BinaryTree();
                }
                this.right.add(value);
            }

        }
    }

    public boolean exists(int value){
        return true;
    }

    public Integer max(){
        return 0;
    }

    public Integer min(){
        return 0;
    }




}
