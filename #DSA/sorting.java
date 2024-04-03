public class sorting {

    public static void sortArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //time complexity = O(n^2)
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        sortArray(arr);
    }
}