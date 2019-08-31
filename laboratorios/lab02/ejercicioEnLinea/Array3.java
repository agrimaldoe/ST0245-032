Online Exercises:
Array 3:
1.
public boolean linearIn(int[] outer, int[] inner) {
  int count = 0; //C1
  for(int i = 0; i < inner.length; i++){ //C2*q
    for(int j = 0; j < outer.length; j++){ //C3*q*n (where q <= n), so in the worst case  q = n --> //C3*n*n
      if(inner[i] == outer[j]){ //C4*n*n
        count++; //C5*n*n
        break; //C6*n*n
      }
    }
  }
  return count == inner.length; //C7
}
2.
public int[] seriesUp(int n) {
  int [] ans = new int [n*(n+1)/2]; //C1
  int pos = 0; //C2
  for(int i = 1; i <= n; i++){ //C3*l
    for(int j = 1;j <= i; j++){ //C4*l*f (where f <= l), so in the worst case f = l --> // C4*l*l 
      ans[pos] = j; //C5*l*l
      pos++; //C6*l*l
    }
  }
  return ans; //C7
}
3.
public boolean canBalance(int[] nums) {
  int acum1 = 0; //C1
  int acum2 = 0; //C2
  for(int i = 0; i < nums.length; i++){ //C3*m
    acum1 += nums[i]; //C4*m
    for(int j = i+1; j < nums.length; j++){//C5*m*(m-1)
      acum2 += nums[j]; //C6*m*(m-1)
    }
    if(acum1 == acum2){ //C7*m 
      return true; //C8
    }
    acum2 = 0; //C9*m
  }
  return false; //C10
}
4.
public int[] fix34(int[] nums) {
  int aux = 0; //C1
  for(int i = 0; i < nums.length; i++){ //C2*r
    if(nums[i] == 3){ //C3*r
      aux = nums[i+1]; //C4*r
      nums[i+1] = 4; //C5*r
      for(int j = i + 2; j < nums.length; j++){ //C6*r*(r-2)
        if(nums[j] == 4){ //C7*r*(r-2)
          nums[j] = aux; //C8*r*(r-2)
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
    for(int i = 0; i < nums.length; i++){ //C5*t
      for(int j = nums.length - 1; j >= 0; j--){ //C6*t*t
        if(nums[j] == nums[i]){ //C7*t*t
          span = j - i + 1; //C8*t*t
           if(span > maxSpan){ //C9*t*t
            maxSpan = span; //C10*t*t
          }
        }
      }
    }
  return maxSpan; //C11
}
