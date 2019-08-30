Online Exercises:
Array 3:
1.
public boolean linearIn(int[] outer, int[] inner) {
  int count = 0;
  for(int i = 0; i < inner.length; i++){ //C*n
    for(int j = 0; j < outer.length; j++){ //C*n*n
      if(inner[i] == outer[j]){ // C*n*n
        count++;
        break;
      }
    }
  }
  return count == inner.length; //C
}
2.
public int[] seriesUp(int n) {
  int [] ans = new int [n*(n+1)/2];
  int pos = 0;
  for(int i = 1; i <= n; i++){ //C*n
    for(int j = 1;j <= i; j++){ //C*n*n
      ans[pos] = j;
      pos++;
    }
  }
  return ans; //C
}
3.
public boolean canBalance(int[] nums) {
  int acum1 = 0; 
  int acum2 = 0;
  for(int i = 0; i < nums.length; i++){ //C*n
    acum1 += nums[i];
    for(int j = i+1; j < nums.length; j++){//C*n*(n-1)
      acum2 += nums[j];
    }
    if(acum1 == acum2){ //C 
      return true; //C
    }
    acum2 = 0;
  }
  return false; //C
}
4.
public int[] fix34(int[] nums) {
  int aux = 0;
  for(int i = 0; i < nums.length; i++){ //C*n
    if(nums[i] == 3){ //C2*n
      aux = nums[i+1];
      nums[i+1] = 4; 
      for(int j = i + 2; j < nums.length; j++){ //C*n*n
        if(nums[j] == 4){ //C*n*n
          nums[j] = aux;
        }
      }
    }
  }
  return nums; //C
}
5.
public int maxSpan(int[] nums) {
  int maxSpan = 0;
  for(int i = 0; i< nums.length; i++){ //C*n
    int leftPos = 0;
    int rightPos = 0;
    for(int j = 0; j < nums.length; j++){ //C*n*n
      if(nums[j] == nums[i]){ //C*n*n
        leftPos=j;
        break;
      }
    }
    for(int k = nums.length - 1; k >= 0; k--){ //C*n*n
      if(nums[k] == nums [i]){ //C*n*n
        rightPos= k;
        break;
      }
    }
      int span = rightPos - leftPos + 1;
      if(span > maxSpan){ // C*n
        maxSpan = span;
      }
  }
  return maxSpan; //C
}
