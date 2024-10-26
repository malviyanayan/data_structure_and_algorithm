
public class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }

    public String toString(){
        return "[" + val + " Left:" + left.val + " Right:" + right.val + "]";
    }
}
