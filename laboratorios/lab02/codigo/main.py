import random
import time
from matplotlib import pyplot as plt
import numpy as np

def mergeSort(l):
    '''
    Organizes an array in decreasing order dividing in halves the array
    ''' 
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
    '''
    Organizes Organize an array in decreasing order thorugh comparations
    '''
    for i in range(1, len(l)): 
  
        actual = l[i] 
        j = i-1
        while j >=0 and actual < l[j] : 
                l[j+1] = l[j] 
                j -= 1
        l[j+1] = actual 
               
def listaRand(n):
    '''
    Generates a random list with n elements
    '''
    lista = [0]  * n
    for i in range(n):
        lista[i] = random.randint(0, 1000)
    return lista

#Test Sizes
listado=[8250,8500,8750,9000,9250,9500,9750,10000,10250,10500,10750,11000,11250,11500,11750,12000,12250,12500,12750,13000]

#Test
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
