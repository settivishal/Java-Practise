package BinaryTree.Problems;

import java.util.Stack;

public class InorderUsingStack {
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
    InorderUsingStack(int key)
	{
		root = new Node(key);
	}

	InorderUsingStack()
	{
		root = null;
	}
    
    private static void inOrderUsingStack(Node node) {
        if(node == null) return;

        Stack<Node> s = new Stack<Node>();

        while(node != null){
            s.push(node);
            node = node.left;
        }

        while(s.size() > 0){
            Node temp = s.pop();
            System.out.print(temp.key+" ");

            if(temp.right != null){
                Node t = temp.right;
                while(t != null){
                    s.push(t);
                    t = t.left;
                }
            }
        }
    }

    public static void main(String[] args){
        InorderUsingStack a = new InorderUsingStack();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        inOrderUsingStack(a.root);
    }

}
