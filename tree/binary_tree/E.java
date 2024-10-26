// find level of Tree 

public class E {
    public static void main(String[] args) {
        Node root = Tree.createTree();
        System.out.println("\n~~~~~~~~~~~~~~~~~\n");
        System.out.println("level of Tree is : " + Tree.level(root));
        System.out.println("Height of Tree is : " + Tree.height(root));
    }
}
