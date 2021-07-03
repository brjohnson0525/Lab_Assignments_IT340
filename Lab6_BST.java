class Lab6_BST { 
 private Node root; 
    //Basic Node definition. Each Node contains a Value, a left child, and a right child
    class Node { 
        int val; 
        Node left, right; 
  
        public Node(int value) { 
         val = value; 
            left =null;
            right = null; 
        } 
    } 
  
  
    public Lab6_BST(int rootValue) {  
        root = new Node(rootValue);  
    } 
  
    //insert Value into the appropriate spot in the tree
    private Node insert(Node root,int value) { 
  

        if (root == null) { 
            root = new Node(value); 
            return root; 
        } 
  
        if (value < root.val) 
            root.left = insert(root.left, value); 
        else if (value > root.val) 
            root.right = insert(root.right, value); 
  
        return root; 
    } 
  
 
    //finish code to print all values with an inorder traversal
    void inorderTraversal(Node node) { 
        if (node != null) { 
          return;
          
          printinorderTraversal(node.left);  
          System.out.println(node.val); 
          printinorderTraversal(node.right);
        } 
    } 
  
    void printinorderTraversal() {printinorderTraversal(root);}
    
    public static void main(String[] args) { 
     //create tree with a root of 5
        Lab6_BST tree = new Lab6_BST(5);   
      
        tree.insert(tree.root,2); 
        tree.insert(tree.root,7); 
        tree.insert(tree.root,10); 
        tree.insert(tree.root,4); 
        tree.insert(tree.root,1);  
  
        //start traversal at root
        tree.inorderTraversal(tree.root); 
    } 
}