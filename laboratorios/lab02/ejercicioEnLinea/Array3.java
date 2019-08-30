Online Exercises:
Array 3:
1.
public boolean linearIn(int[] outer, int[] inner) {
  int count = 0;
  for(int i = 0; i < inner.length; i++){
    for(int j = 0; j < outer.length; j++){
      if(inner[i] == outer[j]){
        count++;
        break;
      }
    }
  }
  return count == inner.length;
}
2.
public int[] seriesUp(int n) {
  int [] ans = new int [n*(n+1)/2];
  int pos = 0;
  for(int i = 1; i <= n; i++){
    for(int j = 1;j <= i; j++){
      ans[pos] = j;
      pos++;
    }
  }
  return ans;
}
3.
public boolean canBalance(int[] nums) {
  int acum1 = 0; 
  int acum2 = 0;
  for(int i = 0; i < nums.length; i++){
    acum1 += nums[i];
    for(int j = i+1; j < nums.length; j++){
      acum2 += nums[j];
    }
    if(acum1 == acum2){return true;}
    acum2 = 0;
  }
  return false;
}
4.
public int[] fix34(int[] nums) {
  int aux = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 3){
      aux = nums[i+1];
      nums[i+1] = 4; 
      for(int j = i + 2; j < nums.length; j++){
        if(nums[j] == 4){
          nums[j] = aux;
        }
      }
    }
  }
  return nums;
}
5.
public int maxSpan(int[] nums) {
  int maxSpan = 0;
  for(int i = 0; i< nums.length; i++){
    int leftPos = 0;
    int rightPos = 0;
    for(int j = 0; j < nums.length; j++){
      if(nums[j] == nums[i]){
        leftPos=j;
        break;
      }
    }
    for(int k = nums.length - 1; k >= 0; k--){
      if(nums[k] == nums [i]){
        rightPos= k;
        break;
      }
    }
      int span = rightPos - leftPos + 1;
      if(span > maxSpan){
        maxSpan = span;
      }
  }
  return maxSpan;
}