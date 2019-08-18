def formas(n):
  '''Function which calculate the number of ways for filling a rectangle of 2xn with rectangles of 2x1'''
  if(n <= 2):
    return n
  return formas(n-1) + formas(n-2)


