class Solution {
    public int firstMissingPositive(int[] nums) {
     

        int n = nums.length ; int N = nums.length + 1 ;
        
        //if the length of array is equalls to zero then we return 1 ;
        if(n==0){
            return 1;
        }
        
        //first we remove all the negative and 0s in the array and replace them with N;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= 0){
                nums[i] = N;
            }
        }
        
        //now what we do is we iterate through each element and then set it's index's position to a -ve number;
        //i repeat read that again if u did't understand we are taking the value of the element and making that index's vaule a -ve number ;
        for(int i = 0 ; i < n ; i++){
            int value = Math.abs(nums[i]) ;
            //absolute value bcz when we have changed the value of an integer to -ve then we have to take its +ve value to make the index as 0 ;
            if(value<=n && nums[value - 1] > 0){
                //we used nums[value -1] because indexes start from 0 but numbers are staring from 1 ;
                nums[value-1] = -nums[value-1];
            }
        }
        
        //now the very first + ve number's index would be our answer ;
        for(int i = 1 ; i <= n ; i++){
            if(nums[i-1]>0){
                return i ;
            }
        }
        
        //if ew did't find any that's because all the numbers are in order and all are present in the array so we return N;
        return N;
        
    }
    
}