package BinaryTree.Problems;


class CountNoOfNodes {
    Node root;

    class Node{
        int key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    CountNoOfNodes(int key){
        root = new Node(key);
    }

    CountNoOfNodes(){
        root = null;
    }
    
    private int getCountOfNodes(Node node) {
        if(node == null){
            return 0;
        }

        return 1 + getCountOfNodes(node.left) + getCountOfNodes(node.right);
    }

    public static void main(String[] args){
        CountNoOfNodes a = new CountNoOfNodes();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.println("No of Nodes: "+ a.getCountOfNodes(a.root));
    }

}
