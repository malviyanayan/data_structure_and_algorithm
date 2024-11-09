// first Recursion Program 
// printing "hello Recurtion 10 times..."

class A{
    public static void main(String[] args) {
        int nTimes  = 10;
        print(nTimes);
    }

    static void print(int n){
        if(n==0)return;  // This is base function


        System.out.println("hello Recursion..." + n);
        print(n-1); // recursive call
    }
}