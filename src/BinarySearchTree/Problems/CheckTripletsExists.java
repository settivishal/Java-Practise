package BinarySearchTree.Problems;
//! Solution
//* - Traverse BST in inorder 
//* - While Traversing in inorder, keep on adding value as well in list as well
//* - After traversing, we'll have sorted array/list
//* - Now take one for loop. For each index take two variable start & end, start will point to o index & end will point to lat index
//* - Get sum of values present at start & end index & index i of for loop
//* - If CurrentSum is equal to given sum, return true.
//* - If CurrentSum is less than given sum, increase start by 1.
//* - If CurrentSum is greater than given sum, decrese the end by 1
//* - Check every index of for loop till size - 2 


import java.util.ArrayList;

public class CheckTripletsExists {
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
    CheckTripletsExists(int key)
	{
		root = new Node(key);
	}

	CheckTripletsExists()
	{
		root = null;
	}

    private static boolean checkTripletsExists(Node node, int val) {
        ArrayList<Integer> l = new ArrayList<>();
        getInorder(node,l);

        return checkTripletsExistsUtil(node, l, val);
    }
    private static void getInorder(Node node, ArrayList<Integer> l) {
        if(node == null) return;

        getInorder(node.left, l);
        l.add(node.key);
        getInorder(node.right, l);
    }

    private static boolean checkTripletsExistsUtil(Node node, ArrayList<Integer> l, int val) {

        for (int i = 0; i < l.size()-2; i++) {
            int start = i+1;
            int end = l.size() - 1;

            while(start < end){
                if(val < l.get(i)+l.get(start)+l.get(end)) end--;
                else if(val > l.get(i)+l.get(start)+l.get(end)) start++;
                else return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        CheckTripletsExists a = new CheckTripletsExists();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(checkTripletsExists(a.root, 21));
    }

}
