public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;           // we have one more blank space
                // swap jo khali jagah hogi uspe swapping karenge jo abhi chota element mila hai
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot ko sahi jagah pe le jane ke liye kyuki pivot abhi end mai hai
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;  // pivot index
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pIdx = partition(arr, low , high);
            quickSort(arr, low , pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,4,1,7,8};
        int n = arr.length;
        quickSort(arr , 0 , n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
