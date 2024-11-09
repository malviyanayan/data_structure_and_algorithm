// print 1 - n

class C1 {
    public static void main(String[] args) {
        int n = 45;
        print(n);
    }

    static void print(int n){
        if(n < 1){
            return;
        }
        
        print(n-1);
        if(n==45){
            System.out.println(n); 
            return;
        }
        System.out.print(n + ", ");
    }
}
