import random
import time
from matplotlib import pyplot as plt
import numpy as np

class Taller04:
    def array_sum(lista,n=0):
        if n==len(lista):
            return 0
        else:
            return lista[n]+Taller04.array_sum(lista,n+1)
        
    def comb(counter, lista, param):
        if param != 0 and counter != len(lista):
            return Taller04.comb(counter + 1, lista, param) or Taller04.comb(counter +1, lista, param - lista[counter])
        elif param == 0:
            return True
        else:
            return False
    
    
def listaRand(n):
    lista = [0]  * n
    for i in range(n):
        lista[i] = random.randint(0, 1000)
    return lista

fig, (ax1, ax2) = plt.subplots(1, 2)
for i in range(0,100):
    lista=listaRand(i)
    ms = time.time()*1000.0
    Taller04.array_sum(lista)
    ms2 = time.time()*1000.0-ms
    colors = ("red")
    area = np.pi*2
    ax1.scatter(i, ms, s=area, c=colors, alpha=1)
    
for i in range(1,20):
    lista=listaRand(i)
    ms = time.time()*1000.0
    Taller04.comb(0,lista,random.randint(0,1000))
    ms2 = time.time()*1000.0-ms
    colors = ("blue")
    area = np.pi*2
    ax2.scatter(i, ms, s=area, c=colors, alpha=1)

plt.show()