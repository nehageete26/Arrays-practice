class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1 , k = m+n-1;
            while(j>=0){
                if(i >= 0 && (nums1[i] > nums2[j])){
                nums1[k] =nums1[i];
                i--;
                }
                else {
                nums1[k] = nums2[j];
                j--;
                }
                k--;
            }
    }
}
// in the above we used 3 pointers;



// this solution is using an extra array
// class Solution {
//     public void merge(int[] arr1, int m, int[] arr2, int n) {
//         int[] arr3 = new int[m + n];
//         int left = 0, right = 0, index = 0;

//         while (left < m && right < n) {
//             if (arr1[left] <= arr2[right]) {
//                 arr3[index++] = arr1[left++];
//             } else {
//                 arr3[index++] = arr2[right++];
//             }
//         }

//         while (left < m) {
//             arr3[index++] = arr1[left++];
//         }

//         while (right < n) {
//             arr3[index++] = arr2[right++];
//         }

//         for (int i = 0; i < m + n; i++) {
//             arr1[i] = arr3[i];
//         }
//     }
// }