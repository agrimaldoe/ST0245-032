import numpy as np
class Taller03:
  def hanoi(n, fromm, to, aux):
    if(n==1):
      print("Move disk 1 from", fromm, "to", to)
    else:
      Taller03.hanoi(n-1, fromm, aux, to)
      print("Move disk", n, "from", fromm, "to", to)
      Taller03.hanoi(n-1, aux, to, fromm)
  def permut(pre, cadena):
    if(len(cadena)==0):
      print(pre)
    else:
      for i in range (0, len(cadena)):
        permut(pre + cadena[i], cadena[0:i] + cadena[i+1: len(cadena)])
  
    

