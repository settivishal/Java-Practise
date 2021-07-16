package BinaryTree.Problems;

import java.util.Stack;

public class PostOrderUsingStack {
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
    PostOrderUsingStack(int key)
	{
		root = new Node(key);
	}

	PostOrderUsingStack()
	{
		root = null;
	}

    private static void postOrderUsingStack(Node node) {
        if(node == null) return;

        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(node);

        while(s1.size() > 0){
            Node t = s1.pop();
            s2.push(t);

            if(t.left != null){
                s1.push(t.left);
            }
            if(t.right != null){
                s1.push(t.right);
            }
        }

        while(s2.size() > 0){
            System.out.print(s2.pop().key+" ");
        }
    }

    public static void main(String[] args){
        PostOrderUsingStack a = new PostOrderUsingStack();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        postOrderUsingStack(a.root);
    }

}
