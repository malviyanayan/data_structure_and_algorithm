// print n - 1

class C {
    public static void main(String[] args) {
        int n = 45;
        print(n);
    }

    static void print(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n + ", ");
        print(n-1);
    }
}
