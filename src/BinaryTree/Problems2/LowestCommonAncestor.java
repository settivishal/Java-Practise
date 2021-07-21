package BinaryTree.Problems2;

public class LowestCommonAncestor {
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
    LowestCommonAncestor(int key)
	{
		root = new Node(key);
	}

	LowestCommonAncestor()
	{
		root = null;
	}

    boolean ifN1Present = false;
    boolean ifN2Present = false;
    private Node findLowestCommonAncestor(Node node, int n1, int n2) {
        Node lca = this.findLowestCommonAncestorUtil(node, n1, n2);

        if(ifN1Present && ifN2Present){
            return lca;
        }else if(!ifN1Present && !ifN2Present){
            return null;
        }else{
            int val = lca.key == n1 ? n2 : n1;
            if(ifElementPresent(lca,val)){
                return lca;
            }
        }
        return null;
    }

    
    private Node findLowestCommonAncestorUtil(Node node, int n1, int n2) {
        if(node == null) return null;
        
        if(node.key == n1){
            ifN1Present = true;
            return node;
        }
        if(node.key == n2){
            ifN2Present = true;
            return node;
        }
        
        Node leftLCA = findLowestCommonAncestorUtil(node.left, n1, n2);
        Node rightLCA = findLowestCommonAncestorUtil(node.right, n1, n2);
        
        if(leftLCA != null && rightLCA != null) return node;
        
        return leftLCA != null ? leftLCA : rightLCA;
    }
    
    private boolean ifElementPresent(Node node, int val) {
        if(node == null) return false;

        if(node.key == val) return true;

        return ifElementPresent(node.left, val) || ifElementPresent(node.right, val);
    }

    public static void main(String[] args){
        LowestCommonAncestor a = new LowestCommonAncestor();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(10);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(9);
        a.root.right.right = a.new Node(3);

        Node lca = a.findLowestCommonAncestor(a.root,2,10);
        if(lca != null){
            System.out.print(lca.key);
        }else{
            System.out.print("LCA is null");
        }

    }

    
}
