class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
      double max_average = -2147483647 ;
        double sum = 0 ;
        int i = 0 ; int j = 0 ;
        sum = sum + nums[j];
        
        while(j<nums.length && i<=nums.length-k ){
           
            if(j-i+1 == k){
                double temp = sum/k ;
                max_average = Math.max(max_average , temp ) ;
                sum = sum - nums[i];
                i++;
                
            }
            else if(j-i+1<k){
                j++;
                sum = sum + nums[j];
            }
          
        }
        return max_average ;
        
    }
}