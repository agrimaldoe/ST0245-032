Online Exercises
Recursion 1
1.
public int sumDigits(int n) {
  if(n==0){
    return 0;
  }
  else{
    return n % 10 + sumDigits(n/10);
  }
}
2.
public boolean array6(int[] nums, int index) {
  if(index == nums.length) return false;

  
  if(nums[index] == 6) return true;
  return array6(nums, index + 1);
}
3.
public int bunnyEars2(int bunnies) {
  if(bunnies==0){
    return 0;
  }else if (bunnies % 2 == 0){
    return(3 + bunnyEars2(bunnies-1));
  }
    return(2 + bunnyEars2(bunnies-1));
}
4.
public int triangle(int rows) {
  if(rows == 0){
    return 0;
  }
    return rows + triangle(rows-1);
}
5.
public int bunnyEars(int bunnies) {
  if(bunnies==0){
    return(0);
  }else{
    return(2 + bunnyEars(bunnies-1));
  }
}
