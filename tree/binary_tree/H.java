public class H {
    public static void main(String[] args) {
        // invert of binary tree
        Node root = Tree.createTree();
        
        
        System.out.println("\n~~~~~~~~~~~~~~~~~");
        System.out.println("our Tree is : ");
        Tree.preorder(root);
        System.out.println("\n~~~~~~~~~~~~~~~~~");
        System.out.println("After invert : ");
        Tree.invert(root);
        Tree.preorder(root);
        System.out.println("\n~~~~~~~~~~~~~~~~~");
    }
}
