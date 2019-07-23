class Taller02:
  def mcd(x,y):
    if x%y!=0:
      Taller02.mcd(y,x%y)
    else:
      return y
