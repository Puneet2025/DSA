public class MSPrac{
    public static void conquer(int[] arr, int si , int mid , int ei){
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int mergedIndex = 0;
        while(index1 <= mid && index2 <= ei){
            if(arr[index1] <= arr[index2]){
                merged[mergedIndex++] = arr[index1++];
            } else{
                merged[mergedIndex++] = arr[index2++];
            }
        }

        while(index1 <= mid){
            merged[mergedIndex++] = arr[index1++];
        }

        while(index2 <= ei){
            merged[mergedIndex++] = arr[index2++];
        }

        for(int i = 0 , j = si ; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr , int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si , mid);
        divide(arr, mid + 1, ei);
        conquer(arr , si , mid , ei);
    }
    public static void main(String[] args) {
        int[] arr = {9,5,7,2,1,8};
        int n = arr.length;
        divide(arr, 0 , n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}