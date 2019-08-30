Online Exercises
Array 2:
1.
public int countEvens(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++){ //C1*n
    if(nums[i] % 2 == 0) count++; //C2*n
  }
  return count; //C3
}
2.
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++){ //C1*n
    if(nums[i] == 1 || nums[i] == 3) //2*C2*n 
      return false; //C3
  }
  return true; //C4
}
3.
public boolean sum28(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){ //C1*n
    if(nums[i] == 2) sum+= 2; //C2*n
  }
  return sum == 8; //C3
}
4.
public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for(int i = 0; i < nums.length; i++){ //C1*n
    if(nums[i] == 1) count1++; //C2*n
    if(nums[i] == 4) count4++; //C3*n
  }
  return count1 > count4; //C4
}
5.
public int[] fizzArray(int n) {
  int [] ans = new int [n]; 
  for(int i = 0; i < n; i++){ //C1*n
    ans[i] = i;
  }
  return ans; //C2
}
