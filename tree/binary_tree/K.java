public class K {
    public static void main(String[] args) {
        Node root = Tree.createTree();
        System.out.println("\n~~~~~~~~~~~~~~~\n");
        System.out.println("Diameter of Tree : " + Tree.diameter(root));
    }
}
