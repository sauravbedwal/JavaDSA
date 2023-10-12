package InterviewPractice;

//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {

        //did this with for loop

        int nums[] = {1,3,5,6};
        int target = 5;

        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] == target){
                System.out.println("s" + i);
                break;
            }
            else if((i < n-1) && (target > nums[i]) && (target < nums[i+1])) {
                System.out.println("a" + i+1);
                break;
            }
            else if((target > nums[i]) && (i==n-1)){
                System.out.println("u" + i+1);
                break;
            }
            else if((target < nums[i])){
                System.out.println("r" + i);
                break;
            }
        }

        //can also done by binary algo will do it
    }
}
