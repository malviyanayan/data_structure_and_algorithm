public class I {
    public static void main(String[] args) {
        System.out.println("Perform is same operation on tree");
        Node root1 = Tree.createTree();
        Node root2 = Tree.createTree();

        System.out.println("Is These tree are same : " + Tree.isSame(root1, root2));
    }
}
