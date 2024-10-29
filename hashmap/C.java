// Iterate on Map

import java.util.HashMap;

class C{
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("nayan",24);
        map.put("sourabh",23);
        map.put("anshul",28);
        map.put("Anuj",56);
        map.put("manu",77);

        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key + " -- " + map.get(key));
        }
    }
}