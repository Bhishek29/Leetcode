class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        for(int i = 0 ; i < n ; i++){
            nums1[m] = nums2[i];
            m++;
        }
        
        Arrays.sort(nums1) ;
        
//         int start = 0 ; int end = nums1.length -1 ;
        
//         while(start<=end){
//             int temp = nums1[start];
//             nums1[start]=nums1[end];
//             nums1[end]=temp;
//             start++;end--;
//         }
        
    }
}