class Array {
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(min > i)min = i;
        }

        return min;
    }
}
