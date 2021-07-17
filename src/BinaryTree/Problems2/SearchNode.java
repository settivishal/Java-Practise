package BinaryTree.Problems2;

import java.util.LinkedList;
import java.util.Queue;

public class SearchNode {
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
    SearchNode(int key)
	{
		root = new Node(key);
	}

	SearchNode()
	{
		root = null;
	}

    private static boolean recursiveSearch(Node node,int key) {
        if(node == null) return false;

        if(node.key == key) return true;

        return recursiveSearch(node.left, key) || recursiveSearch(node.right, key);
    }

    private static boolean iterativeSearch(Node node, int key) {

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while(q.size() > 0){
            Node t = q.remove();
            if(t.key == key) return true;

            if(t.left != null) q.add(t.left);

            if(t.right != null) q.add(t.right);
        }
        
        return false;
    }

    public static void main(String[] args){
        SearchNode a = new SearchNode();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(recursiveSearch(a.root,11)+" ");
        System.out.print(iterativeSearch(a.root,11)+" ");
    }

    
}

    
