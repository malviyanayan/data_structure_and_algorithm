// Problem 2: Display Numbers in Descending Order

import java.util.Iterator;
import java.util.TreeSet;

class C{
    public static void main(String[] args){
        Integer[] arr = {4, 1, 3, 7, 5, 2, 7, 3};
        arr = sortInDescending(arr);

        System.out.print("Your List of Desc. Order is : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }

        System.out.println();
    }

    static Integer[] sortInDescending(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>();

        for(Integer item : arr){
            set.add(item);
        }

        int i=0;
        Iterator<Integer> itr = set.descendingIterator();
        Integer[] ans = new Integer[set.size()];
        while(itr.hasNext())ans[i++] = itr.next();

        return ans;
    }
}