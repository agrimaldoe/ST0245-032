Online Exercises:
Array 3:
1.
public boolean linearIn(int[] outer, int[] inner) {
  int count = 0; //C1
  for(int i = 0; i < inner.length; i++){ //C2*n
    for(int j = 0; j < outer.length; j++){ //C3*n*n
      if(inner[i] == outer[j]){ //C4*n*n
        count++; //C5
        break; //C6
      }
    }
  }
  return count == inner.length; //C7
}
2.
public int[] seriesUp(int n) {
  int [] ans = new int [n*(n+1)/2]; //C1
  int pos = 0; //C2
  for(int i = 1; i <= n; i++){ //C3*n
    for(int j = 1;j <= i; j++){ //C4*n*n
      ans[pos] = j; //C5*n*n
      pos++; //C6*n*n
    }
  }
  return ans; //C7
}
3.
public boolean canBalance(int[] nums) {
  int acum1 = 0; //C1
  int acum2 = 0; //C2
  for(int i = 0; i < nums.length; i++){ //C3*n
    acum1 += nums[i]; //C4*n
    for(int j = i+1; j < nums.length; j++){//C5*n*(n-1)
      acum2 += nums[j]; //C6*n*(n-1)
    }
    if(acum1 == acum2){ //C7*n 
      return true; //C8
    }
    acum2 = 0; //C9*n
  }
  return false; //C10
}
4.
public int[] fix34(int[] nums) {
  int aux = 0; //C1
  for(int i = 0; i < nums.length; i++){ //C2*n
    if(nums[i] == 3){ //C3*n
      aux = nums[i+1]; //C4
      nums[i+1] = 4; //C5
      for(int j = i + 2; j < nums.length; j++){ //C6*n*n
        if(nums[j] == 4){ //C7*n*n
          nums[j] = aux; //C8
        }
      }
    }
  }
  return nums; //C9
}
5.
public int maxSpan(int[] nums) {
  if(nums.length == 0){ //C1
    return 0; //C2
  } 
    int maxSpan = 1; //C3
    int span = 0 ; //C4
    for(int i = 0; i < nums.length; i++){ //C5*n
      for(int j = nums.length - 1; j >= 0; j--){ //C6*n*n
        if(nums[j] == nums[i]){ //C7*n*n
          span = j - i + 1; //C8
           if(span > maxSpan){ //C9
            maxSpan = span; //C10
          }
        }
      }
    }
  return maxSpan; //C11
}
