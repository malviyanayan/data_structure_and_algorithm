// Top View of Binary Tree

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class F {
    private static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        TreeNode root = createTree();
        // dispaly(root);
        int[] topView = topViewOfTree(root);

        System.out.print("Top view Nodes : ");
        for(int val : topView)System.out.print(val + ", ");
        System.out.println();
    }

    static int[] topViewOfTree(TreeNode root){
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<QueueNode> queue = new LinkedList<>();

        queue.offer(new QueueNode(root, 0));
        map.put(0, root.val);

        while (!queue.isEmpty()) {
            QueueNode temp = queue.poll();

            if(!map.containsKey(temp.level)){
                map.put(temp.level, temp.node.val);
            }

            if(temp.node.left != null)queue.offer(new QueueNode(temp.node.left, temp.level-1));
            if(temp.node.right != null)queue.offer(new QueueNode(temp.node.right, temp.level+1));
        }

        int[] ans = new int[map.size()];
        int x = 0;
        for(Integer key : map.keySet()){
            ans[x++] = map.get(key);
        }

        Arrays.sort(ans);

        return ans;
    }

    

    final static void dispaly(TreeNode root){
        if(root == null)return;

        System.out.print(root.val + " , ");
        dispaly(root.left);
        dispaly(root.right);
    }

    final static TreeNode createTree(){
        System.out.print("Enter rootNode : ");
        TreeNode root = new TreeNode(Integer.parseInt(sc.nextLine()));

        takenode(root);
        return root;
    }

    private static void takenode(TreeNode temp){
        System.out.print("\nEnter Left Node of " + temp.val + " : ");
        String lft = sc.nextLine();
        System.out.print("Enter Right Node of " + temp.val + " : ");
        String rgt = sc.nextLine();
        try{
            temp.left = new TreeNode(Integer.parseInt(lft));
        }catch(Exception e){
            temp.left = null;
        }
        try{
            temp.right = new TreeNode(Integer.parseInt(rgt));
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

class QueueNode {
    TreeNode node ;
    int level;

    QueueNode(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}