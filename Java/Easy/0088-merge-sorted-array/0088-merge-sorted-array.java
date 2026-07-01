import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != 0 || nums2.length != 0) {
            for (int i = 0; i < nums2.length; i++) {
                 nums1[m + i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}