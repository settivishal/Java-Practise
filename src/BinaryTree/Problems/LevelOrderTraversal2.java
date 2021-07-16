package BinaryTree.Problems;

import java.util.LinkedList;
import java.util.Queue;

//! Using Queues

public class LevelOrderTraversal2 {
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
    LevelOrderTraversal2(int key)
	{
		root = new Node(key);
	}

	LevelOrderTraversal2()
	{
		root = null;
	}

    public static void main(String[] args){
        LevelOrderTraversal2 a = new LevelOrderTraversal2();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        levelOrderTraversal(a.root);
    }

    private static void levelOrderTraversal(Node node) {
        if(node == null) return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while(q.size() > 0){
            Node top = q.remove();
            System.out.print(top.key+" ");

            if(top.left != null){
                q.add(top.left);
            }

            if(top.right != null){
                q.add(top.right);
            }
        }
    }
}
