def formas(n):
  '''Función que calcula el número de formas se puede llenar un rectángulo de 2xn con rectángulos de 2x1'''
  if(n <= 2):
    return n
  return formas(n-1) + formas(n-2)


