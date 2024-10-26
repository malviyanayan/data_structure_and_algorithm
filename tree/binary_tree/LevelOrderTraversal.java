//Level order traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class LevelOrderTraversal extends Tree{

    private static void helper(Queue<Node> queue){
        Node poll = null;
        if((poll = queue.poll()) != null){
            System.out.print(poll.val + ", ");
            if(poll.left != null)queue.offer(poll.left);
            if(poll.right != null)queue.offer(poll.right);
            helper(queue);
        }
    }

    public static void levelOrderTraversal(Node root){
        System.out.println();
        Queue<Node> queue = new LinkedList<>();
        if(root != null)queue.offer(root);
        helper(queue);
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = createTree();

        levelOrderTraversal(root);
        System.out.println(levelOrder(root));
        // List<List<Integer>> lists = new LinkedList<>();
        // System.out.println(lists.size());
    }


    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new LinkedList<>();
        helper(root, lists, 0);
        return lists;   
    }

    public static void helper(Node root, List<List<Integer>> lists,int level){
        if(root == null)return;

        if(level == lists.size()){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        }else{
            List<Integer> list = lists.get(level);
            list.add(root.val);
        }

        helper(root.left, lists, level+1);
        helper(root.right, lists, level+1);
    }
}