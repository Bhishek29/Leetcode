class Solution {
    public int majorityElement(int[] nums) {
        
        int maj = nums.length / 2 ;
        
        Arrays.sort(nums);
         int count = 1 ;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0 ; i < nums.length ; i++){
            // int temp = nums[i];
           
            if(nums[i]==nums[i+1]){
                count++ ;
            }else{
                count = 1;
            }
            if(count>maj){
                return nums[i];
            }
        }
        
        return -1 ;
    }
}