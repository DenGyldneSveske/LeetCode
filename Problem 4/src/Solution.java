import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int size = nums1.length + nums2.length;
        int[] array = new int[size];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            array[index++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            array[index++] = nums2[i];
        }

        Arrays.sort(array);

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (i == j) {
                return median = array[i];
            }
            else if (j < i) {
                return median = ((double)(array[j] + array[i])) / 2;
            }
            else {}
        }

        return median;
    }
}
