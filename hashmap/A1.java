import java.util.HashMap;
import java.util.Set;

public class A1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"nayan");
        map.put(2,"Anshul");
        map.put(3,"lalit");
        map.put(5,"vaishali");
        map.put(4,"Yashank");
        map.put(6,"Geetanjal");
        map.put(7,"chinu");

        System.out.println(map);

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
    }
}
