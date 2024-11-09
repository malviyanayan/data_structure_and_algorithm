import java.util.HashSet;

class Leetcode1781 {
    static void subSequencesHelper(String str, String current, int index, HashSet<String> result) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }
        subSequencesHelper(str, current, index + 1, result);
        subSequencesHelper(str, current + str.charAt(index), index + 1, result);
    }

    public static void main(String[] args) {
        String sqs = "aabcb";
        HashSet<String> set = new HashSet<>();
        subSequencesHelper(sqs, "", 0, set);

        System.out.println("subsequences are : " + set);
    }
        
}
