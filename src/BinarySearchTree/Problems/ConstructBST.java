package BinarySearchTree.Problems;

//!  Construct Balanced BST from given values | Sorted Array to Balanced BST
//* Solution
//* - Sort the given array
//* - Now take variable start, end, mid
//* - Get middle element & create node using value present at this index
//* - Now recursively call value from start to mid - 1 in left side & mid + 1 to end in right side
//* - At last return the node

//* Time Complexity: O(nlogn), if array is sorted then Time complexity will be O(n)
//* Space Complexity: O(1)


import java.util.Arrays;

public class ConstructBST {
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
    ConstructBST(int key)
	{
		root = new Node(key);
	}

	ConstructBST()
	{
		root = null;
	}

    private Node constructBalancedBST(int[] arr) {
        Arrays.sort(arr);

        return constructBalancedBSTUtil(arr,0,arr.length-1);
    }

    private Node constructBalancedBSTUtil(int[] arr, int start, int end) {
        if(start > end) return null;

        int mid = start + (end - start)/2;

        Node node = new Node(arr[mid]);

        node.left = constructBalancedBSTUtil(arr, start, mid-1);
        node.right = constructBalancedBSTUtil(arr, mid+1, end);
        
        return node;
    }

    private void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void main(String[] args){
        ConstructBST a = new ConstructBST();
        a.root = null;

        int[] arr = {8,6,12,18,34,23,3};

        a.root = a.constructBalancedBST(arr);

        a.inOrder(a.root);
        
    }
}
