package InterviewPractice;

//https://leetcode.com/problems/remove-element/description/

public class RemoveElement {
    public static void main(String[] args) {

//      sol if wants to store in new array

        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        int n = nums.length;
        int count = 0;

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            if(nums[i] != val){
                arr[count] = nums[i];
                count++;
            }
        }
        System.out.println("count" + count);

        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

//    public static void main(String[] args) {

//    if want to update the same array

//        int nums[] = {0,1,2,2,3,0,4,2};
//        int val = 2;
//
//        int n = nums.length;
//        int count = 0;
//
//        for(int i=0; i<n; i++){
//            if(nums[i] != val){
//                nums[count] = nums[i];
//                count++;
//            }
//        }
//        System.out.println("count" + count);
//
//        for (int i=0; i<n; i++){
//            System.out.println(nums[i]);
//        }
//    }
}
