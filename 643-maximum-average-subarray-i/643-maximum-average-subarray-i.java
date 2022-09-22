class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
      double max_average = -2147483647 ;
        //first we take the max value of the average as the minimun value of the integer ;
        
        //we take a sum variable to be 0 ;
        double sum = 0 ;
        //and two pointer which will be i and j ;
        int i = 0 ; int j = 0 ;
        
        //initialy the sum would be the first element of the array ;
        sum = sum + nums[j];
        
        //We are using sliding window we are defining the range of the pointer to be the size of the window and the following conditions ;
        while(j<nums.length && i<=nums.length-k ){
           
            if(j-i+1 == k){
                //this is the condition for a window of size k ;
                double temp = sum/k ;
                max_average = Math.max(max_average , temp ) ;
                sum = sum - nums[i];
                i++;
                
            }//if the window is small then we will be increasing the size of it ;
            else if(j-i+1<k){
                j++;
                sum = sum + nums[j];
            }
          
        }
        //then we return the maximum average ;
        return max_average ;
        
    }
}