package InterviewPractice;

//https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        int n  = nums.length;

         for(int i=0; i<n; i++) {
             for(int j=i+1; j<n; j++) {
                 if(nums[i] == nums[j]) {
                     System.out.println(nums[i]);
                 }
             }

                 }
    }
}
