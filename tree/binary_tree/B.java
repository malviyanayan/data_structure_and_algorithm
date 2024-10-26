public class B {
    public static void main(String[] args) {
        // find max value of tree
        Node root = Tree.createTree();
        int max = Tree.max(root);
        System.out.println("\n!!!!!!!!!!!!!!!!!\n");
        System.out.println("Max of Tree is : " + max);
    }
}