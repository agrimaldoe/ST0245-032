class Taller02:
  def mcd(x,y):
    if x%y!=0:
      Taller02.mcd(y,x%y)
    else:
      return y
  def comb(counter, lista, param):
    if param != 0 and counter != len(lista):
      return Taller02.comb(counter + 1, lista, param) or Taller02.comb(counter +1, lista, param - lista[counter])
    elif param == 0:
      return True
    else:
      return False
  def comb2(pre,cadena):
    if len(cadena)!=0:
      Taller02.comb2(pre,cadena[1:len(cadena)])
      Taller02.comb2(pre+cadena[0:1],cadena[1:len(cadena)])
