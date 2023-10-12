package InterviewPractice;

import org.w3c.dom.ls.LSOutput;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {

    //solution is correct but if ask to update the array also then need to ask for sol from mentor

    public static void main(String[] args) {
        int nums[] = {1,1,2};
        int n = nums.length;

        int count = 1;

        for(int i=0; i<n-1; i++){
            if(nums[i] != nums[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }


}
