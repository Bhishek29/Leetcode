class Solution {
    public int reachNumber(int target) {
       
        int steps = 0 ; int sum = 0 ;
        
        if (target < 0 ){
            target = 0 - target ;
        }
        
        if(target == 0){
            return 0;
        }
        
        while(sum < target){
            sum = sum + steps;
            steps++;
        }
        
        while((target-sum) % 2 != 0 ){
            sum = sum + steps ;
            steps++;
        }
        
        return steps - 1;
        
    }
}