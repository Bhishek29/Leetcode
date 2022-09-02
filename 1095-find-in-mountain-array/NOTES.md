////////////good wali khud ki approach
//finding the peak element ;
int start = 0 ; int end = mountainArr.length()-1 ; int mid = 0 ;
while(start <= end){
mid = start + (end - start)/2;
if(mountainArr.get(mid) < mountainArr.get(mid +1)){
start = mid +1 ;
}else if (mountainArr.get(mid) > mountainArr.get(mid +1)){
end = mid ;
}if(start == end){
mid = end ;
break ;
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
-
if(target == mountainArr.get(mid)){
return mid ;