package MocInterviewDSA1.MediumLevel;


//Problem 2: Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
// must appear as many times as it shows in both arrays and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9] or [9,4]


public class IntersectionArray {
    public static void main(String[] args) {

        int a[] = {4, 9, 5};
        int n = a.length;

        int b[] = {9, 4, 9, 8, 4};
        int m = b.length;


        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){

                if (a[i] == b[j]){


                }
            }
        }


    }
}
