package Basic_java;
/* Q: Find an element from the given array and cheak whether it is present in the array or not */
/* nums = {12,34,565,35,7,34,7,23,68,24,35,};  */

public class LSearch {
    public static void main(String[] args) {
        int [] nums = {12,34,565,35,7,34,7,23,68,24,35,};
        int target = 680;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index ++ ){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
 
    } 
}
