package InterviewPractice;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int m = 3;
        int n = 3;

        for (int i=0; i<m+n; i++){
            for(int j=0; j<n; j++){
                if(nums1[i] < nums2[j]){
                    nums1[i] = nums1[i];
//                    i++;
                    break;
                }
                else if(nums1[i] == nums2[j]){
                    nums1[i] = nums1[i];
//                    i++;
                    break;
                }
                else {
                    nums1[i] = nums2[j];
                }
            }
        }
        for(int i=0; i<m+n; i++){
            System.out.println(nums1[i]);
        }

    }
}
