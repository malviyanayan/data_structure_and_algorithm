public class A {
    public static void main(String[] args) {
        Node root = Tree.createTree();

        System.out.println("Sum of Nodes : " + Tree.sumOfNodes(root, 0));
    }
}
