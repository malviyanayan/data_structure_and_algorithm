// calculate factorial of n

class B {
    public static void main(String[] args) {
        // int n = 7;
        // int n = 4;
        int n = 6;
        int fact = fact(n);
        System.out.println("Factorial of n is : " + fact);
    }

    static int fact(int n){
        if(n==1)return 1;

        return n * fact(n-1);
    }
}
