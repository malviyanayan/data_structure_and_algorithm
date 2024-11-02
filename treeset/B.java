import java.util.TreeSet;

// Problem 1: Unique Sorted Names

class B{
    public static void main(String[] args) {
        String [] list = {"Alice", "Bob", "Charlie", "Alice", "Eve", "Bob"};

        String[] afterOpe = listAndRemoveDup(list);

        System.out.print("List is (" + afterOpe.length + ") : " );

        for(String str : afterOpe){
            System.out.print( str + ", ");
        }
        System.out.println();
    }

    static String[] listAndRemoveDup(String[] list){
        TreeSet<String> ans = new TreeSet<>();
        
        for(String item : list){
            ans.add(item);
        }
        

        String[] finalAns = new String[ans.size()];

        ans.toArray(finalAns);

        return finalAns;
    }
}