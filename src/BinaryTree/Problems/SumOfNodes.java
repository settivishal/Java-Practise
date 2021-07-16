package BinaryTree.Problems;


class SumOfNodes {
    Node root;

    class Node{
        int key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    SumOfNodes(int key){
        root = new Node(key);
    }

    SumOfNodes(){
        root = null;
    }
    
    private int getSumOfNodes(Node node) {
        if(node == null){
            return 0;
        }

        return node.key + getSumOfNodes(node.left) + getSumOfNodes(node.right);
    }

    public static void main(String[] args){
        SumOfNodes a = new SumOfNodes();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.println("Sum of Nodes: "+ a.getSumOfNodes(a.root));
    }

}
