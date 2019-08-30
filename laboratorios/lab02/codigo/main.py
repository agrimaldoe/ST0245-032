import random
import time
from matplotlib import pyplot as plt
import numpy as np

def mergeSort(l): 
    if len(l) >1: 
        m = len(l)//2 
        left = l[:m] 
        right = l[m:] 
  
        mergeSort(left) 
        mergeSort(right) 
  
        i = 0
        j = 0
        k = 0
          
        while i < len(left) and j < len(right): 
            if left[i] < right[j]: 
                l[k] = left[i] 
                i+=1
            else: 
                l[k] = right[j] 
                j+=1
            k+=1
          
        while i < len(left): 
            l[k] = left[i] 
            i+=1
            k+=1
          
        while j < len(right): 
            l[k] = right[j] 
            j+=1
            k+=1
  
def insertSort(l): 
    for i in range(1, len(l)): 
  
        key = l[i] 
        j = i-1
        while j >=0 and key < l[j] : 
                l[j+1] = l[j] 
                j -= 1
        l[j+1] = key 
               
def listaRand(n):
    lista = [0]  * n
    for i in range(n):
        lista[i] = random.randint(0, 1000)
    return lista

listado=[100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475]

for i in listado:
    lista=listaRand(i)
    ms = time.time()*1000.0
    insertSort(lista)
    ms2 = time.time()*1000.0-ms
    colors = ("blue")
    area = np.pi*2
    plt.scatter(i, ms2, s=area, c=colors, alpha=1)
for i in listado:
    lista=listaRand(i)
    ms = time.time()*1000.0
    mergeSort(lista)
    ms2 = time.time()*1000.0-ms
    colors = ("red")
    area = np.pi*2
    plt.scatter(i, ms2, s=area, c=colors, alpha=1)
plt.show()
