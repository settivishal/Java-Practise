package BinaryTree.Problems2;

import java.util.LinkedList;
import java.util.Queue;

//! Print Vertical Order of Binary Tree 

public class PrintSumLevelWise {
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
    PrintSumLevelWise(int key)
	{
		root = new Node(key);
	}

	PrintSumLevelWise()
	{
		root = null;
	}

    private static void printSumLevelWises(Node node) {
        if(node == null) return;

        Queue<Node> q = new LinkedList<Node>();

        q.add(node);

        while(true){
            int size = q.size();
            if(size == 0) break;

            int sum = 0;
            while(size > 0){
                Node t = q.remove();
                sum += t.key;

                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
                size--;
            }
            System.out.print(sum+" ");
        }
        return;
    }

    public static void main(String[] args){
        PrintSumLevelWise a = new PrintSumLevelWise();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printSumLevelWises(a.root);
    }
}

    
