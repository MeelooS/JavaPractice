package day10;

public class Node {
    private int a;
    private Node leftChild;
    private Node rightChild;
    public Node(int a){
        this.a=a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public String toString(){
        return ("Node "+ "a:"+a+", "+ "leftChild= "+leftChild+", "+"rightChild= "+rightChild+ "}");
    }
}
