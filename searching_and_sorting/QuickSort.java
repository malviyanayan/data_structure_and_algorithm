class QuickSort {
    public static void main(String[] artgs){
        // int[] arr = {7,8,3,1,4,9,5,90,54,45,87,67,23};
        int[] arr = {1};


        quickSort(arr,0,arr.length-1);
        System.out.print("After Sorting : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }    

    static void quickSort(int[] arr,int s,int e){
        if(s<e){
            int p = partition(arr,s,e);
            
            quickSort(arr,s,p-1);
            quickSort(arr,p+1,e);

        }
    }



    static int partition(int[] arr,int s,int e){
        int pivot = s;
        for(int i=s;i<=e;i++){
            if(arr[i]<arr[s])pivot++;
        }
        
        // move pivot element to its correct position
        int temp = arr[s];
        arr[s] = arr[pivot];
        arr[pivot] = temp;

        while(s< pivot && e > pivot){
            while(arr[s] < arr[pivot])s++;
            while(arr[e] > arr[pivot])e--;
            if(arr[s]>arr[e]){
                int temp1 = arr[s];
                arr[s] = arr[e];
                arr[e] = temp1;
            }
        }

        return pivot;
    }
}
