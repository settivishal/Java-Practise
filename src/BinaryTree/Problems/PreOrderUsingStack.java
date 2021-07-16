package BinaryTree.Problems;

import java.util.Stack;

public class PreOrderUsingStack {
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
    PreOrderUsingStack(int key)
	{
		root = new Node(key);
	}

	PreOrderUsingStack()
	{
		root = null;
	}

    private static void preOrderUsingStack(Node node) {
        if(node == null) return;

        Stack<Node> s = new Stack<Node>();
        
        s.push(node);

        while(s.size() > 0){
            Node t = s.pop();
            System.out.print(t.key+" ");
            if(t.right != null){
                s.push(t.right);
            }
            if(t.left != null){
                s.push(t.left);
            }
        }
    }

    public static void main(String[] args){
        PreOrderUsingStack a = new PreOrderUsingStack();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        preOrderUsingStack(a.root);
    }

}
