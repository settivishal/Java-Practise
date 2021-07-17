package BinaryTree.Problems2;

import java.util.LinkedList;
import java.util.Queue;

//! Get width of a level in Binary Tree | Get number of nodes of a level
//*Solution: 
//* - Recursively we'll reach till level 1 & when we reach level = 1, return 1 & add them
//* - When node is 0, return 0
//* - When level is 1, return 1
//* import java.util.LinkedList;
//* import java.util.Queue;

public class PrintWidthOfLevel {
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
    PrintWidthOfLevel(int key)
	{
		root = new Node(key);
	}

	PrintWidthOfLevel()
	{
		root = null;
	}

    
    private static int printWidthOfLevelIterative(Node node,int level) {
        if(node == null) return 0;

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        int l = 1;
        int width = 0;

        while(true){
            int size = q.size();
            width = 0;

            if(l == level){
                while(size > 0){
                    width++;
                    size--;
                }
                return width;
            }

            while(size > 0){
                Node t = q.remove();

                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);

                size--;
            }
            l++;
        }
    }

    private static int printWidthOfLevelRecursive(Node node, int level) {
        if(node == null) return 0;

        if(level == 1) return 1;

        return printWidthOfLevelRecursive(node.left, level-1) + printWidthOfLevelRecursive(node.right,level-1);
    }

    public static void main(String[] args){
        PrintWidthOfLevel a = new PrintWidthOfLevel();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(printWidthOfLevelIterative(a.root,2));
        System.out.println();
        System.out.print(printWidthOfLevelRecursive(a.root,2));
    }
}

