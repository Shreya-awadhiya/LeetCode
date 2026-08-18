class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Make nums1 the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int total = nums1.length + nums2.length;

        int low = 0;
        int high = nums1.length;

        while (low <= high) {

            int partitionX = (low + high) / 2;

            int partitionY = (total + 1) / 2 - partitionX;

            int l1 = partitionX == 0
                    ? Integer.MIN_VALUE
                    : nums1[partitionX - 1];

            int r1 = partitionX == nums1.length
                    ? Integer.MAX_VALUE
                    : nums1[partitionX];

            int l2 = partitionY == 0
                    ? Integer.MIN_VALUE
                    : nums2[partitionY - 1];

            int r2 = partitionY == nums2.length
                    ? Integer.MAX_VALUE
                    : nums2[partitionY];

            // Correct partition found
            if (l1 <= r2 && l2 <= r1) {

                // Even number of elements
                if (total % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }

                // Odd number of elements
                else {
                    return Math.max(l1, l2);
                }
            }

            // partitionX is too far right
            else if (l1 > r2) {
                high = partitionX - 1;
            }

            // partitionX is too far left
            else {
                low = partitionX + 1;
            }
        }

        return 0.0;
    }
}



















// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int m = nums1.length;
//         int n = nums2.length;
//         int newSize = m+n;
//         int F[] = new int[newSize];

//         System.arraycopy(nums1,0,F,0,m);
//           System.arraycopy(nums2,0,F,m,n);
//          System.out.println( "" + Arrays.toString(F));
//          Arrays.sort(F);

//           int mid = F.length/2;

//           if(F.length%2 != 0){   //odd
//           return F[mid];
//           }
//           else{   //even
//           double s = (F[mid]+F[mid+1])/2;
//           return s;
//           }

//     }
// }