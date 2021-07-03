class Lab7_BST { 
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
  
  
    public Lab7_BST(int rootValue) {  
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
    
    void postOrder (Node node) {
      if (node == null)
        return;
      
      printpostOrder(node.left);
      printpostOrder(node.right);
      System.out.println(node.val + " ");
}
  
    void preOrder (Node node) {
     if (node == null)
       return;
     
     printpreOrder(node.left);
     printpreOrder(node.right);
     System.out.println(node.val + " ");
    }
    void printinorderTraversal() {printinorderTraversal(root);}
    void printpostOrder() {printpostOrder(root);}
    void printpreOrder() {printpreOrder(root);}
    public static void main(String[] args) { 
     //create tree with a root of 5
        Lab7_BST tree = new Lab7_BST(5);   
      
        tree.insert(tree.root,2); 
        tree.insert(tree.root,7); 
        tree.insert(tree.root,10); 
        tree.insert(tree.root,4); 
        tree.insert(tree.root,1);  
  
        //start traversal at root
        tree.inorderTraversal(tree.root); 
    } 
}