// Find Duplicates
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class E {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,5,3,2,12,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        ArrayList<Integer> dul = new ArrayList<>();

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) > 1)dul.add(key);
        }

        System.out.println(dul);
    }
}
