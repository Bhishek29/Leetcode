class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        
        if(nums.length == 3){
            if(nums[0]+ nums[1]+nums[2] == 0){
                arr.add(new ArrayList<>(Arrays.asList(nums[0],nums[1],nums[2])));
                return arr;
            }else{
                return arr;
            }
        }
        
       
        int z = 0 ;
        
        for(int i = 0 ; i < nums.length -2 ; i++){
            
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                
                int sum = 0 - nums[i];
                int start = i+1;
                int end = nums.length -1 ;
                
                while(start<end){
                    
                    if(nums[start] + nums[end] == sum ){
                        arr.add(z ,new ArrayList<>(Arrays.asList(nums[i],nums[start],nums[end])));
                        
                        while(start<end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start<end && nums[end] == nums[end-1]){
                            end--;
                        }
                        z++;
                    }
                    
                    if(nums[start] + nums[end] <= sum){
                        start = start + 1;
                    }
                    
                    else if(nums[start] + nums[end] >= sum){
                        end = end -1 ;
                    }
                }
            }
        }
        
        return arr ;
    }
               
}           