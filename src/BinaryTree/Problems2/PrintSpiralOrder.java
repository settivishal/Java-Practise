package BinaryTree.Problems2;

import java.util.Stack;

//! Print Binary Tree in Spiral Order

public class PrintSpiralOrder {
    Node root;

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    PrintSpiralOrder(int key)
	{
		root = new Node(key);
	}

	PrintSpiralOrder()
	{
		root = null;
	}

    private static void printSpiralOrder(Node node) {
        if(node == null) return;

        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(node);
        while(!s1.empty() || !s2.empty()){
            while(!s1.empty()){
                Node t = s1.pop();
                System.out.print(t.key+" ");

                if(t.right != null) s2.push(t.right);
                if(t.left != null) s2.push(t.left);
            }
            while(!s2.empty()){
                Node t = s2.pop();
                System.out.print(t.key+" ");

                if(t.left != null) s1.push(t.left);
                if(t.right != null) s1.push(t.right);
            }
        }
    }

    public static void main(String[] args){
        PrintSpiralOrder a = new PrintSpiralOrder();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(12);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printSpiralOrder(a.root);
    }

    
}
