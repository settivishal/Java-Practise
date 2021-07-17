package BinaryTree.Problems2;

import java.util.LinkedList;
import java.util.Queue;

//! Print elements between any two given level of Binary Tree

public class PrintNodes {
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
    PrintNodes(int key)
	{
		root = new Node(key);
	}

	PrintNodes()
	{
		root = null;
	}
    
    private static void printNodes(Node node,int min,int max) {
        if(node == null) return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        int l = 1;

        while(true){
            int size = q.size();
            if(size == 0|| l > max) break;

            while(size > 0){
                Node t = q.remove();
                if(l >= min && l <= max){
                    System.out.print(t.key+" ");
                }
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);

                size--;
            }
            l++;
        }
    }

    public static void main(String[] args){
        PrintNodes a = new PrintNodes();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printNodes(a.root,2,4);
    }

}
