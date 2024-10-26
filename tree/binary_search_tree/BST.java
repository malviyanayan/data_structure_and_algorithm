import java.util.Scanner;

public class BST{

    private static Scanner sc = new Scanner(System.in);

    public static int maximum(Node root){
        while(root.right != null)root = root.right;
        return root.val;
    }

    public static int minimum(Node root){
        while(root.left != null)root = root.left;
        return root.val;
    }


    public static void inorder(Node root){
        if(root == null)return;

        inorder(root.left);
        System.out.print(root.val + ", ");
        inorder(root.right);
    }

    public final static Node createTree(){
        System.out.print("Enter rootNode : ");
        Node root = new Node(Integer.parseInt(sc.nextLine()));

        takenode(root);
        return root;
    }

    private static void takenode(Node temp){
        System.out.print("\nEnter Left Node of " + temp.val + " : ");
        String lft = sc.nextLine();
        System.out.print("Enter Right Node of " + temp.val + " : ");
        String rgt = sc.nextLine();
        try{
            temp.left = new Node(Integer.parseInt(lft));
        }catch(Exception e){
            temp.left = null;
        }
        try{
            temp.right = new Node(Integer.parseInt(rgt));
        }catch(Exception e){
            temp.right = null;
        }

        if(temp.left != null){
            takenode(temp.left);
        }
        if(temp.right != null){
            takenode(temp.right);
        }
    }
}