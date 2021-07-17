package BinaryTree.Problems2;

//! Create Binary tree from InOrder & Preorder
//* Solution: 
//* - Here we're given inorder & preorder array
//* - We'll take a global variable preIndex = 0 & one by one operate on this one
//* - Find this value in inorder array & all left values will be in left sub tree & all right values will be in right sub tree
//* - Recursively call for node.left & node.right

//* - Time Complexity - O(n^2) 
//* - Space Complexity: O(n)

public class CreateBinaryTree {
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
    CreateBinaryTree(int key)
	{
		root = new Node(key);
	}

	CreateBinaryTree()
	{
		root = null;
	}

    static CreateBinaryTree a = new CreateBinaryTree();
    static int preIndex;

    private static Node createBinaryTree(int[] preorderArray, int[] inorderArray, int start, int end) {
        if(start > end) return null;
        
        Node node = a.new Node(preorderArray[preIndex++]);

        if(start == end){
            return node;
        }

        int inorderIndex = getInorderIndex(node.key,inorderArray,start,end);

        node.left = createBinaryTree(preorderArray, inorderArray, start, inorderIndex-1);
        node.right = createBinaryTree(preorderArray, inorderArray, inorderIndex+1, end);

        return null;
    }

    private static int getInorderIndex(int key, int[] inorderArray, int start, int end) {
         for (int i = start; i <= end; i++) {
            if (inorderArray[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        a.root = null;
        int[] preorderArray = {2, 4, 7, 3, 8};
        int[] inorderArray = {7, 4, 3, 2, 8};

        a.root = createBinaryTree(preorderArray,inorderArray,0,inorderArray.length-1);
    }
}
