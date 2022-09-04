class Solution {
    public int missingNumber(int[] nums) {
        
         int ans = 0 ;
        for(int i = 1 ; i<=nums.length ;i++){
            
            ans = search(nums,i);
            
            if(ans==-1){
                return i ;
            }
        }
        
        return 0;
        
    }
    
    int search(int[] nums , int n ){
        for(int i = 0 ; i < nums.length ; i++){
            if(n == nums[i]){
                return n ;
            }
        }
        return -1 ;
        
    }
}