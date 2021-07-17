package BinaryTree.Problems2;

//! Solution: 
//* - We'll take one queue & take level & size variable & max_width
//* - Add element in queue from root node & keep on adding left & right in queue
//* - We'll check if size is greater than max_width then update the max_width
//* - When size is zero for a level, we'll increase level
//* - Add the last return max_width

//* Time Complexity: O(n)
//* Space Complexity: O(n)

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
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
    MaximumWidth(int key)
	{
		root = new Node(key);
	}

	MaximumWidth()
	{
		root = null;
	}

    private static int maximumWidth(Node node) {
        if(node == null) return 0;

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        int maxSize = 1;
        while(true){
            int size = q.size();
            if(size == 0) break;

            if(size > maxSize) maxSize = size;

            while(size > 0){
                Node t = q.remove();

                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
                
                size--;
            }
        }
        return maxSize;
    }

    public static void main(String[] args){
        MaximumWidth a = new MaximumWidth();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(maximumWidth(a.root));
}
}

    
