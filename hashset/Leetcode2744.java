// Find Maximum Number of String pairs

import java.util.HashSet;

class Leetcode2744{
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        int counts = maximumNumberOfStringPairs(words);
        System.out.println(counts);


    }

    static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(String str : words){
            if(set.contains(reverse(str))){
                count ++;
            }else set.add(str);
        }
        return count;
    }

    private static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}