public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99,100} ;
        int length = arr.length-1;

        int x = 77;

      int result = binarysearch( arr, x);
      if(result == -1){
          System.out.println("not found");
      }else{
          System.out.println(result);
      }


    }

    private static int binarysearch(int arr[], int x) {

        int low = 0;
        int high = arr.length -1;

        int mid = (low + high)/2;
        while(low <= high){
         if(arr[mid] == x ){
             return arr[mid];
         }

         if(arr[mid] > x){
             high= mid-1;
         }else {
             low = mid+1;
         }
        }
        return -1;
    }
}
