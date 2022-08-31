class Solution {
    public int singleNumber(int[] nums) {
        
        
        if(nums.length == 1){
            return nums[0];
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            int temp = nums[i];
            int count = 0 ;
            for(int j = 0 ; j < nums.length ;j++){
                if(nums[j]==temp){
                    count++;
                }
            }
            if(count != 2){
                return nums[i];
            }
        }
        return -1 ;
        
    }
}