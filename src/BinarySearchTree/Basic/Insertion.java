package BinarySearchTree.Basic;

public class Insertion {
    class Node{
        int key;
        Node left,right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    Insertion(){
        root = null;
    }

    void insert(int key){
        root = insertRecursive(root,key);
    }

    Node insertRecursive(Node root, int key){
        if(root == null){
            root = new Node(key);
        }
        if(key < root.key){
            root.left = insertRecursive(root.left, key);
        }
        else if(key > root.key){
            root.right = insertRecursive(root.right, key);
        }

        return root;
    }

    void inOrder(Node node){
        if(node == null) return;
        
        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
        
    }

    public static void main(String[] args){
        Insertion tree = new Insertion();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder(tree.root);
    }
}
