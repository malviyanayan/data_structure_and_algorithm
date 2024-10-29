import java.util.HashMap;
// Using Java HashMap

class A{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nayan", 12);
        map.put("kartik", 117);
        map.put("Abhinav", 9);

        System.out.println(map);
        System.out.println(map.remove("nayan"));;

        System.out.println(map);
        System.out.println(map.containsKey("kartik"));
    }
}