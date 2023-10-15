package InterviewPractice;

//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
    public static void main(String[] args) {

        int nums[] = {0,1,0,3,12};
        int n = nums.length;

        int index = 0;

        for(int i=0; i<n; i++) {
            int temp;
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.println(nums[i]);
        }

    }
}
