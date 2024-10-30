class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = {5,2,1,3,5,6,8,7,4,3};
        // int[] arr = {5};
        // int[] arr = {};
        int[] arr = {9,7,3,7,3,1,2};

        selectionSort(arr);
        System.out.println("After sort : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }   
    
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = i+1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[temp])arr[j] = arr[temp];
            }

            if(arr[temp]<arr[i]){
                int x = arr[temp];
                arr[temp] = arr[i];
                arr[i] = x;
            }
        }
    }
}
