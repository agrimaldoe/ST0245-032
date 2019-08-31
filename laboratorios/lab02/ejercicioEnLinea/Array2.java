Online Exercises
Array 2:
1.
public int countEvens(int[] nums) {
  int count = 0; //C1
  for(int i = 0; i < nums.length; i++){ //C2*n
    if(nums[i] % 2 == 0) count++; //C3*n
  }
  return count; //C4
}
2.
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++){ //C1*l
    if(nums[i] == 1 || nums[i] == 3) //C2*l
      return false; //C3
  }
  return true; //C4
}
3.
public boolean sum28(int[] nums) {
  int sum = 0; //C1
  for(int i = 0; i < nums.length; i++){ //C2*m
    if(nums[i] == 2) sum+= 2; //C3*m
  }
  return sum == 8; //C4
}
4.
public boolean more14(int[] nums) {
  int count1 = 0; //C1
  int count4 = 0; //C2
  for(int i = 0; i < nums.length; i++){ //C3*r
    if(nums[i] == 1) count1++; //C4*r
    if(nums[i] == 4) count4++; //C5*r
  }
  return count1 > count4; //C6
}
5.
public int[] fizzArray(int n) {
  int [] ans = new int [n]; //C1
  for(int i = 0; i < n; i++){ //C2*t
    ans[i] = i; //C3*t
  }
  return ans; //C4
}
