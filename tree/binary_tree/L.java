public class L {
    public static void main(String[] args) {
        Node root = Tree.createTree();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~\n"); // this can only practice on leetcode
        System.out.println("Lowest Common Ancestor : " + Tree.lowestCommonAncestor(root, root, root));
    }
}
