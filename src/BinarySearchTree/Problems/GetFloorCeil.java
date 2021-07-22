package BinarySearchTree.Problems;

//! Get Floor & Ceil for a given value in Binary Search Tree (BST)
//* Solution
//* - Start traversal from root
//* - Take two Node variable:floor & ceil
//* - If given value is less than current node, go to left side & store ceil = node
//* - If given value is greater than current node, go to right side & store floor == node
//* - If node is equal to given value assign floor = ceil = node & break the loop
//* - Do this until node isnot null
//* - At last return the floor & ceil variable

//* Time Complexity: O(h), where h is height of tree
//* Space Complexity: O(1)

import java.util.ArrayList;
import java.util.List;

public class GetFloorCeil {
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
    GetFloorCeil(int key)
	{
		root = new Node(key);
	}

	GetFloorCeil()
	{
		root = null;
	}

    private static List<Node> getFloorAndCeil(Node node, int val) {
        if(node == null) return new ArrayList<>();

        List<Node> list = new ArrayList<>();

        Node floor = null;
        Node ceil = null;

        while(node != null){
            if(val < node.key){
                ceil = node;
                node = node.left;
            }else if(val > node.key){
                floor = node;
                node = node.right;
            }else{
                ceil = floor = node;
                break;
            }
        }
        
        list.add(floor);
        list.add(ceil);

        return list;

    }
    public static void main(String[] args){
        GetFloorCeil a = new GetFloorCeil();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        List<Node> data = getFloorAndCeil(a.root,25);

        if(data.get(0) != null) System.out.println("floor: "+data.get(0).key);
        else System.out.println("No valid floor present for the given value");
        
        if(data.get(1) != null) System.out.println("ceil: "+data.get(1).key);
        else System.out.println("No valid ceil present for the given value");
    }

}
