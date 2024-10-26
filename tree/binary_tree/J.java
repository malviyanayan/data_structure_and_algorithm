public class J {
    public static void main(String[] args) {
        Node root = Tree.createTree();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Is this tree is symmetric : " + Tree.isSymmitric(root));
    }
}
