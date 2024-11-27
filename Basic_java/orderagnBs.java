package Basic_java;
public class orderagnBs {
    public static void main(String[] args) {
        int [] arr = {-5,-4,0,2,4,5,6,7,8,56,78,89,235};
        int target = -4;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
        
    }
    //return the index
    //return -1 if the element does not exist

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];  //in ascending the start will be smaller than the starting element of the array 
        
        while (start <= end) {
            // find the middile element

            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid- 1;
                } else{
                    start = mid + 1;
                }

            }else {
                if (target > arr[mid]){
                    end = mid- 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;     // if the element is not present in the array then it will print -1 
    }    
}
    

