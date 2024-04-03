public class company1 {
    public static int getSum(int[] arr, int k){
        int maxSum = 0;
        int sum = 0;
        int start = 0;
        for(int end = 0; end < arr.length; end++){
            sum += arr[end];
            if(end >= k - 1){
                maxSum = Math.max(sum, maxSum);
                sum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,12,3,2};
        int k = 3;
        int result = getSum(arr,k);
        System.out.println(result);
    }
}

//118,119 homework