// Frequency Count for integer Array
import java.util.HashMap;

class D{
    public static void main(String[] args){
        int[] arr = {1,2,1,3,45,6,4,2,1,4,3,5,45,6,47};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                int val = map.get(i);
                map.put(i,val+1);
            }else{
                map.put(i, 1);
            }

            // map.put(i, map.getOrDefault(i,0) + 1);
        }

        System.out.println(map.entrySet());
        System.out.println("Size : " + map.size());
        
    }
}