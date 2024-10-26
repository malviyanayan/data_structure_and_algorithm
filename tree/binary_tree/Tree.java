import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public abstract class Tree {
    private static final Scanner sc = new Scanner(System.in);

    // public static void max(Node root , Integer maximum){
    //     if(root == null)return;

    //     maximum = Math.max(maximum, root.val);
    //     max(root.left,maximum);
    //     max(root.right,maximum);
    // }

    public static void preOrderIterative(Node root){
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);

        while(!nodes.isEmpty()){
            Node node = nodes.pop();
            System.out.print(node.val + " ");
            if(node.right != null)nodes.push(node.right);
            if(node.left != null)nodes.push(node.left);
        }
    }

    public static void printElementOfNthLevel(Node root,int level,int targetLevel){
        if(root == null){
            System.out.println();
            return;
        }

        if(level == targetLevel)System.out.print(root.val + " ");
        printElementOfNthLevel(root.left, level+1, targetLevel);
        printElementOfNthLevel(root.right, level+1, targetLevel);
    }

    public static final Node lowestCommonAncestor(Node root,Node p,Node q){
        if(find(root.left,p) && find(root.right,q)) return root;

        if(root.left == null && root.right == null)return null;
        Node left = lowestCommonAncestor(root.left, p, q);
        if(left != null)return left;
        else return lowestCommonAncestor(root.right, p, q);
        
    }

    public static final boolean find(Node root,Node p){
        if(root == null)return false;
        if(root == p)return true;

        return find(root.left, p) || find(root.right, p);
    }

    public static final boolean isSymmitric(Node root){
        if(root.right != null)rotateRight(root.right);
        return isSame(root.left, root.right);
    }

    public static final int diameter(Node root){
        if(root == null)return 0;
        int mynode = level(root.left) + level(root.right);
        int l = diameter(root.left);
        int r = diameter(root.right);
        return Math.max(Math.max(mynode, l), Math.max(l, r));
    }

    private static final void rotateRight(Node root){
        if(root == null)return;
        rotateRight(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static final boolean isSame(Node root1,Node root2){
        if(root1 == null && root2 == null)return true;
        if(root1 == null || root2 == null)return false;
        if(root1.val != root2.val)return false;

        if(!isSame(root1.left, root2.left))return false;
        if(!isSame(root1.right, root2.right))return false;
        return true;
    }

    public static final void invert(Node root){
        if(root == null)return ;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    public static final void anotherOrderTraversal(Node root){
        ArrayList<Integer>  preorder = new ArrayList<>();
        ArrayList<Integer>  inorder = new ArrayList<>();
        ArrayList<Integer>  postorder = new ArrayList<>();
        pFAOT(root,preorder,inorder,postorder);
        System.out.println();
        System.out.println("Preorder : " + preorder);
        System.out.println("inorder : " + inorder);
        System.out.println("postorder : " + postorder);
        System.out.println();
    }

    private static final void pFAOT(Node root,ArrayList<Integer> preorder,ArrayList<Integer> inorder,ArrayList<Integer> postorder){
        if(root == null)return;
        preorder.add(root.val);
        pFAOT(root.left, preorder, inorder, postorder);
        inorder.add(root.val);
        pFAOT(root.right, preorder, inorder, postorder);
        postorder.add(root.val);

    }

    public static final void postorder(Node root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + ", ");
    }

    public static final void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.val + ", ");
        inorder(root.right);
    }
    
    public static final void preorder(Node root){
        if(root == null)return;
        System.out.print(root.val + ", ");
        preorder(root.left);
        preorder(root.right);
    }

    public static final int productOfNodes(Node root){
        if(root == null)return 1;
        else if(root.val == 0)return productOfNodes(root.left)*productOfNodes(root.right);
        return root.val * productOfNodes(root.left)*productOfNodes(root.right);
    }

    public static final int height(Node root){
        return level(root)-1;
    }

    public static final int level(Node root){
        if(root == null)return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public static final int size(Node root){
        if(root == null)return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static final int max(Node root){
        if(root == null)return Integer.MIN_VALUE;
        return Math.max(Math.max(root.val,max(root.left)),Math.max(root.val,max(root.right)));
    }

    public static final int min(Node root ){
        if(root == null)return Integer.MAX_VALUE;
       
        return Math.min(Math.min(min(root.left), root.val),Math.min(min(root.right), root.val));
    }

    
    public final static int sumOfNodes(Node root,int sum){
        if(root == null)return 0;
        return root.val + sumOfNodes(root.left, sum) + sumOfNodes(root.right, sum);
    }

    public final static void dispaly(Node root){
        if(root == null)return;

        System.out.print(root.val + " , ");
        dispaly(root.left);
        dispaly(root.right);
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
