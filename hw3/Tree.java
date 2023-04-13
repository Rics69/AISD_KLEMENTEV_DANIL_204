package AISD;

public class Tree {

    public static void main(String[] args) {
        AISD.Tree tree = new AISD.Tree();
        tree.add(10);
        tree.add(6);
        tree.add(123);
        AISD.Tree.soutWide(tree);
    }

    Node root;

    public Tree(){
        this.root = null;
    }

    private Node addInNode(Node root, int value){
        if(root == null){
            Node newNode = new Node(value);
            return newNode;
        }
        if(root.value > value){
            root.left = addInNode(root.left, value);
        }

        if(root.value < value){
            root.right = addInNode(root.right, value);
        }
        return root;
    }

    public void add(int value){
        root = addInNode(root, value);
    }

    private boolean get(Node e, int value){
        if(e == null){
            return false;
        }
        if(root.value == value){
            return true;
        }else if(value > e.value){
            return get(e.left, value);
        }else{
            return get(e.right, value);
        }
    }

    public boolean find(int value){
        return get(root, value);
    }

    public void traverse(Node root){
        if(root == null){
            traverse(root.left);
            System.out.println(root.value);
            traverse(root.right);
        }
    }

    public static void soutWide(AISD.Tree tree){
        Node root = tree.root;
        MyQueue1<Node> que = new MyQueue1<>();
        que.add(root);
        while(!que.isEmpty()){
            Node node = que.remove();
            System.out.println(node.value);
            if(node.left != null){
                que.add(node.left);
            }
            if(node.right != null){
                que.add(node.right);
            }
        }
    }
}
