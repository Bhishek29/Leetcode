class Solution {
    public void rotate(int[] nums, int k) {
    
        int n = nums.length ;// we took this to be the length of array ;
        if(k==0){
            return;// bcz then no rotation will be there ;
        }
        k = k% n ;//so that we can reduce the number of conversions //not so useful in this but good approach ;
        
        swap(nums,0, n-k-1 );//first we rotate the first half of the array till n-k ;
        
        swap(nums,n-k , n-1);//then the other half of the array i.e. n-k+1 to end element ;
        
        swap(nums, 0 , n-1);//then we rotate the full array ;
    }
    
    int[] swap (int[] nums , int i , int j ){
        //a function for rotating the array ;
        while(i<j){
            int temp = nums[i] ;
            nums[i] = nums[j] ;
            nums[j] = temp;
            i++;
            j--;
        }
        return nums ;
    }
}