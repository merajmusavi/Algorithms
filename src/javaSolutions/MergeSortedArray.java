package javaSolutions;

public class MergeSortedArray {

    public static void main(String[] args) {
        /* two array, nums1 and nums2 [a,b,c],[d,e] => sorted in a non-decreasing format m & n is the number of elements.
             merge nums1 and nums2 in a single array sorted in non-decreasing order

             the final result should not return in a new List, in should return in nums1


             [a,b,c,-,-,-] => size = m + n
             [d,e,f] => size = n

         */


    }

    static void merge(int[] nums1, int[] nums2, int m, int n) {
        // pointer to the last element
        int n1p = m - 1;
        int n2p = n - 1;
        // write pointer
        int wp = n + m - 1;

        while (wp >= 0) {
            if (n1p < 0) {
                nums1[wp--] = nums2[n2p--];
            } else if (n2p < 0) {
                nums1[wp--] = nums1[n1p--];
            } else {
                if (nums1[n1p] > nums2[n2p]) {
                    nums1[wp] = nums1[n1p];
                    wp--;
                    n1p--;
                } else {
                    nums1[wp] = nums2[n2p];
                    wp--;
                    n2p--;
                }
            }
        }


    }
}
