public class slidingWinSubArrMaxSum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 0, 9, 6, 5, 8, 2};
        int k = 4;

      int ans =  calcmaxsum(arr, k);
        System.out.println(ans);

    }

    private static int calcmaxsum(int[] arr, int k) {

        int n = arr.length;

        int kSum = 0;

        if(n < k){
            return -1;
        }

        for (int i = 0; i < k ; i++) {
            kSum += arr[i];
        }

        int maxSum =kSum;

        for (int j = k; j < n ; j++) {
             maxSum = maxSum + arr[j] - arr[j-k];
             maxSum = Math.max(maxSum, kSum);
        }

    return maxSum;
    }

}
