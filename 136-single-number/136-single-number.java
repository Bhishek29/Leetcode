class Solution {
    public int singleNumber(int[] nums) {
        
        //brute force approach ;
        
        //if length of array is 1 we return the only element as ans l
        if(nums.length == 1){
            return nums[0];
        }
        
        //else what we do is we use 2 for loop and keep checking if it comes twice or not
        //if not then we return the element ;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < nums.length ;j++){
                if(nums[j]==nums[i]){
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