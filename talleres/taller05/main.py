import random
import time
from matplotlib import pyplot as plt
import numpy as np

def organizar(lista):
    for a in range(0,len(lista)):
        for b in range(0,a):
            if lista[a]>=lista[b]:
                aux=lista[a]
                lista[a]=lista[b]
                lista[b]=aux
    #T(n)=n+n(n+1)/2+3n es O(n^2)
    # El codigo no es apropiado para grandes volumenes de datos ya que como se comporta de manera cuadratica, los tiempos aumentan muy rapido
    return lista
def suma(lista):
    suma=0
    for a in lista:
        suma=suma+a
    return suma
    #T(n)=c1+2n es O(n)
    #El tiempo de ejecución en la implementación recursiva tiende a una complejidad igual a la implementación por ciclos

def listaRand(n):
    lista = [0]  * n
    for i in range(n):
        lista[i] = random.randint(0, 1000)
    return lista

#fig, (ax1, ax2) = plt.subplots(1, 2)
for i in range(0,800):
    lista=listaRand(i)
    ms = time.time()*1000.0
    suma(lista)
    ms2 = time.time()*1000.0-ms
    colors = ("blue")
    area = np.pi*0.1
    plt.scatter(i, ms, s=area, c=colors, alpha=1)
    
for i in range(1,800):
    lista=listaRand(i)
    ms = time.time()*1000.0
    organizar(lista)
    ms2 = time.time()*1000.0-ms
    colors = ("red")
    area = np.pi*0.1
    plt.scatter(i, ms, s=area, c=colors, alpha=1)

plt.show()