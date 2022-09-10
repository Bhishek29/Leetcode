class Solution {
    public int singleNonDuplicate(int[] nums) {
     
//         //Done using both brute and binary approach you can submit both as both are acceptable ;
        
//        //Using brute force approach ;
//         //we iterate through each even element and then check if the element in front of it is same as it or not of not then we will return the element ;
        
//         if(nums.length == 1){
//             return nums[0];
//             //we return the first element only if the size of the array is 1 ;
//         }
//         for(int i = 0 ; i < nums.length ; i++){
//             if(i %2 ==0 || i == 0){
//                 if(i+1 < nums.length){
//                 if(nums[i] == nums[i+1]){
//                     continue ;
//                 }else{
//                     return nums[i];
//                 }}else{
//                     return nums[nums.length -1];
//                 }
//             }
//         }
//         return -1 ;
        
//         //Using binary search approach ;
//         //we  used binary search to find the single element ;
//         int start = 0 ; int end = nums.length -2 ;
        
//         //usual binary search approach ;
//         while(start <= end){
//             int mid = start + (end - start)/2;
            
//             if(nums[mid] == nums[mid^1]){
//                 start = mid + 1 ;
//             }else{
//                 end  = mid -1 ;
//             }
//         }
//         return nums[start];
        
        
        int start = 0 ; int end = nums.length - 2;
        
        while(start <= end){
            int mid = start + (end - start)/2 ;
            
            if(mid == 0){
                if(nums[mid] == nums[mid+1]){
                    start = mid + 1;
                }else{
                    return nums[mid];
                }
            }
            else if(mid%2 == 0 ){
                if(nums[mid] == nums[mid -1]){
                    end = mid -1 ;
                }else if(nums[mid] == nums[mid+1]){
                    start = mid + 1;
                }else{
                    return nums[mid];
                }
            }else if(mid%2 != 0){
                if(nums[mid]==nums[mid-1]){
                    start = mid + 1; 
                }else if(nums[mid]==nums[mid+1]){
                    end = mid -1;
                }else{
                    return nums[mid];
                }
            }
        }
        
        return nums[start];
    }
}