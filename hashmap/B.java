// Iterate on Map

import java.util.HashMap;
import java.util.Iterator;

class B{
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("nayan",24);
        map.put("sourabh",23);
        map.put("anshul",28);
        map.put("Anuj",56);
        map.put("manu",77);

        System.out.println(map);

        Iterator<String> itr =  map.keySet().iterator();   
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str + " ### " + map.get(str));
        }
    }
}