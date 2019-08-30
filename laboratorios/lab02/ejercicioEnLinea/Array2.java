Online Exercises
Array 2:
1.
public int countEvens(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++){ //C*n
    if(nums[i] % 2 == 0) count++; //C*n
  }
  return count; //C
}
2.
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++){ //C*n
    if(nums[i] == 1 || nums[i] == 3) //2*C*n 
      return false; //C
  }
  return true; //C
}
3.
public boolean sum28(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){ //C*n
    if(nums[i] == 2) sum+= 2; //C*n
  }
  return sum == 8; //C
}
4.
public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for(int i = 0; i < nums.length; i++){ //C*n
    if(nums[i] == 1) count1++; //C*n
    if(nums[i] == 4) count4++; //C*n
  }
  return count1 > count4; //C
}
5.
public int[] fizzArray(int n) {
  int [] ans = new int [n]; 
  for(int i = 0; i < n; i++){ //C*n
    ans[i] = i;
  }
  return ans; //C
}
