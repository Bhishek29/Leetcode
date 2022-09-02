/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
          //finding the peak element ;
        int start = 0 ; int end = mountainArr.length()-1 ; int mid = 0 ;
        
        
        while(start <= end){
            mid = start + (end - start)/2;
            
            if(mountainArr.get(mid) < mountainArr.get(mid +1)){
                start = mid +1 ;
            }else if(start == end){
                mid = end ;
                break ;
            }else{
                end = mid ;
            }
        }
        
        int peak = mid ;
        
        if(mountainArr.get(mid) == target){
            return mid;
        }
        //first searching on the left side ;
        
        int left = binary(mountainArr ,0 , peak -1 , target , true) ;
        
        if (left != -1){
            return left ;
        }
        //then searching on the right side ;
        int  right  = binary(mountainArr , peak+1 ,mountainArr.length()-1 , target , false) ;
        
        return right ;
        
    }
    
    int binary(MountainArray mountainArr , int start , int end , int target , boolean asc ){
        
        while(start <= end){
         int mid = start+(end - start)/2;
           
            if(target == mountainArr.get(mid)){
                return mid ;
            }
        
         if(mountainArr.get(mid)<target){
                if(asc){
                    start = mid+1 ;
                }else{
                    end = mid -1 ;
                } } 
            else {
                if(asc){
                end =mid -1 ;
            }
                else{
                start = mid + 1;
            }
            }
        }
        
          return -1 ;
    }
}