     
def toPostOrder(preorder, pos, left, right):
  if(pos[0] == len(preorder)):
    return 
  if(preorder[pos[0]] < left or preorder[pos[0]]> right):
    return 
  number = preorder[pos[0]]
  pos[0] += 1
  toPostOrder(preorder, pos, left, number)
  toPostOrder(preorder, pos, number, right)
  print(number)
  
def aux(preorder):
  pos = [0]
  toPostOrder(preorder, pos, -2**31, 2**31)

lista = [50, 30, 24,5,28,45,98,52,60]
aux(lista)



