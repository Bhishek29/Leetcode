class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      
//         // Brute force approach; 
//         // its correct nothing wrong in it but it will not get submitted because it is not optimized for ;
//         // large inputs ;
//         ArrayList<Integer> arr = new ArrayList<>();
//         for(int i = 0 ; i <nums.length ; i++){
//           arr.add(i+1) ;
//       }
//         for(int i = 0 ; i < nums.length ; i++){

//             for(int j = 0 ; j < arr.size() ; j++){
//                 if(nums[i] == arr.get(j)){
//                     arr.remove(j);                
//                 }
//             }
//         }
       
//         return arr ;
        
        //optimized approach ;-
        ArrayList<Integer> arr = new ArrayList<>();
        
        //we 
        for(int i = 0 ; i < nums.length ;i++){
            int value = Math.abs(nums[i]) ;
            if(value <= nums.length && nums[value - 1] > 0 ){
            nums[value-1] = -nums[value-1] ; 
            }
        }
        
        for(int i = 1 ;i <= nums.length ;i++){
            if(nums[i-1] > 0){
                arr.add(i);
            }
        }
        
        return arr;
        
    }
}