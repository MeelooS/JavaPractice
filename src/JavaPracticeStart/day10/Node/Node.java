package JavaPracticeStart.day10.Node;

public class Node {
    int a;
    private Node leftChild;
    private Node rightChild;

    public Node(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }

    public void insertNode(int a, Node parentNode){
        if(a<parentNode.getA()){
            if(parentNode.leftChild==null){
                parentNode.leftChild = new Node(a);
            } else {
                insertNode(a, parentNode.leftChild);
            }
        }
        if (a>parentNode.getA()){
            if(parentNode.rightChild==null){
                parentNode.rightChild= new Node(a);
            } else {
                insertNode(a, parentNode.rightChild);
            }
        }
    }

    public static void recursiveOutput(Node node) {
        if (node != null) {
            System.out.println("node: " + node.getA());
            recursiveOutput(node.leftChild);
            recursiveOutput(node.rightChild);
        }
    }
}
