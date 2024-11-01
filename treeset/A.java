// TreeSet practice it is just like HashSet but main difference it that
// between treeset and hashset is TreeSet is sorted but HashSet not

import java.util.TreeSet;
import java.util.HashSet;

class A{
    public static void main(String[] args){
        TreeSet<Integer> tset = new TreeSet<>();
        HashSet<Integer> hset = new HashSet<>();

        tset.add(10);hset.add(10);
        tset.add(-1);hset.add(-1);
        tset.add(9);hset.add(9);
        tset.add(18);hset.add(18);
        tset.add(13);hset.add(13);
        tset.add(11);hset.add(11);
        tset.add(99);hset.add(99);
        tset.add(77);hset.add(77);

        System.out.println("HashSet is : " + hset);
        System.out.println("TreeSet i   s : " + tset);
    }
}