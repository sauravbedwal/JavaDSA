package InterviewPractice;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    //i have done this by my logic as bhati just formed an array and saved the index in it that sol is below

//    public static void main(String[] args) {
//            int nums[] = {2,7,11,15};
//            int target = 9;
//            twoSum(nums, target);
//        }
//        public static int twoSum(int[] nums, int target) {
//            System.out.println(target);
//            int n = nums.length;
//
//            for(int i=0; i<n; i++) {
//                for(int j=i+1; j<n; j++){
//                    if(target == nums[i] + nums[j]){
//                        System.out.println(i + " " + j);
//                    }
//                }
//            }
//            return -1;
//        }


    //bhati sol. nothing new as in both the sol we doing sout

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(nums, target);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
//        System.out.println(target);
        int n = nums.length;

        int sum[] = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if(target == nums[i] + nums[j]){
               sum[0] = i;
               sum[1] = j;
                }
            }
        }
        return sum;
    }
}
