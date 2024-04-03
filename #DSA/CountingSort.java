public class CountingSort {
    public static void CountSort(int[] arr, int[] temp , int k){
        int[] c = new int[k + 1];
        for(int i = 0 ; i <= k; i++){
            c[i] = 0;
        }
        for(int j = 0; j < arr.length; j++){
            
        }
    } 
    public static void main(String[] args) {
        int[] arr = {7,6,4,2,1,8,3};
        int n = arr.length;
        int[] temp = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max , i);
        }
        CountSort(arr,temp,max);
    }
}
