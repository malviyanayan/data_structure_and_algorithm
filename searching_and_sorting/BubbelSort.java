class BubbelSort {
    public static void main(String[] args) {
        // int[] arr = {7,8,3,1,4,9,5,90,54,45,87,67,23};
        // int[] arr = {7};
        int[] arr = {};

        bubbelSort(arr);


        System.out.print("After Sorting : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }    

    static void bubbelSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
