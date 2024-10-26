// import java.util.ArrayList;
import java.util.Scanner;


@SuppressWarnings("unchacked")
public class BinarySearchTree<E> {
    private static Scanner sc = new Scanner(System.in);
    private Node1<E> root ;
   @SuppressWarnings("rawtypes")
    private Class type ;



    // ###### Requered Method #######

    public String getType(){
        return "" + type;
    }


    public Node1<E> getRoot(){
        return root;
    }

    public E getRooVal(){
        return root.val;
    }


    private String takeType(){
        System.out.println("\t1. Boolean");
        System.out.println("\t2. Character");
        System.out.println("\t3. String");
        System.out.println("\t4. Integer");
        System.out.println("\t5. Float");
        
        int type = Integer.parseInt(sc.nextLine());
        String tp = "";

        switch (type) {
            case 1:
                this.type = Boolean.class;
                tp = "Bolean";
                break;
        
            case 2:
                this.type = Character.class;
                tp = "Character";
                break;
        
            case 3:
                this.type = String.class;
                tp = "String";
                break;
        
            case 4:
                this.type = Integer.class;
                tp = "Integer";
                break;
        
            case 5:
                this.type = Float.class;
                tp = "Float";
                break;
        }

        return tp;
    }




    // #######  Constructor #######
    public BinarySearchTree(){
        takeType();
        root = createTree();
    }

    // Creating Tree with taking input
    private Node1<E> createTree(){
        if(true){

        }

        return null;
    }

    // @Override
    // public String toString() {
    //     return "Binary Search Tree (inorder) : " + inorder();
    // }

    // private ArrayList<Integer> inorder(){
    //     return null;
    // }

    // // ############# Constructor #################
    // public BinarySearchTree(){
    //     root = createTree();
    // }






    // // ############# Methods ##############




    // // *******************
    // // **** Methods ******
    // // *******************
    
    // private final Node1<E> createTree(){
    //     System.out.print("Enter rootNode : ");
    //     Node1<E> root = new Node1(Integer.parseInt(sc.nextLine()));

    //     takenode(root);
    //     return root;
    // }

    // private static void takenode(Node1 temp){
    //     System.out.print("\nEnter Left Node of " + temp.val + " : ");
    //     String lft = sc.nextLine();
    //     System.out.print("Enter Right Node of " + temp.val + " : ");
    //     String rgt = sc.nextLine();
    //     try{
    //         temp.left = new Node1(Integer.parseInt(lft));
    //     }catch(Exception e){
    //         temp.left = null;
    //     }
    //     try{
    //         temp.right = new Node1(Integer.parseInt(rgt));
    //     }catch(Exception e){
    //         temp.right = null;
    //     }

    //     if(temp.left != null){
    //         takenode(temp.left);
    //     }
    //     if(temp.right != null){
    //         takenode(temp.right);
    //     }
    // }
}
