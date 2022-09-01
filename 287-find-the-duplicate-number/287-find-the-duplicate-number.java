class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        int start = 0 ; int end = nums.length -1 ;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] == nums[mid+1] || nums[mid] == nums[mid-1]){
                return nums[mid] ;
            }else if(nums[start] == nums[start + 1]){
                return nums[start];
            }else if(nums[end] == nums[end -1]){
                return nums[end];
            }else{
                start++;
                end--;
            }
        }
        return -1 ;
    }
    
}