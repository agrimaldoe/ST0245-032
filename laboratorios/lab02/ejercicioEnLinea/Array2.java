Online Exercises
Array 2:
1.
public int countEvens(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0) count++;
  }
  return count;
}
2.
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1 || nums[i] == 3)return false;
  }
  return true;
}
3.
public boolean sum28(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2) sum+= 2;
  }
  return sum == 8;
}
4.
public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1) count1++;
    if(nums[i] == 4) count4++;
  }
  return count1 > count4;
}
5.
public int[] fizzArray(int n) {
  int [] ans = new int [n];
  for(int i = 0; i < n; i++){
    ans[i] = i;
  }
  return ans;
}
