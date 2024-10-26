//preorder inorder and postorder traversal of trees

public class G {
    public static void main(String[] args) {
        Node root = Tree.createTree();

        System.out.println("!!....Tree is Created successfully...!!\n");

        System.out.print("preorder Traversal : ");Tree.preorder(root);
        System.out.print("Inorder Traversal : ");Tree.inorder(root);
        System.out.print("postorder Traversal : ");Tree.postorder(root);
        System.out.println("\n\n Traversal is completed..!!");
    }
}
