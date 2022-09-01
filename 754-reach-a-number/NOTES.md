​
///vanshika ///
​
int start = 0, i = 1, steps = 0;
while(start!=target) {
steps++;
if((start+i) <= target) {
start = start + i;
i++;
}
else {
start = start - i;
i++;
}
}
return steps;