#!/usr/bin/env python
# coding: utf-8

# In[17]:


class Taller09:
    def add(tabla,s,p):
        tabla[s]=p
    def buscarEmpresa(tabla,s):
        if s in tabla:
            print("La empresa",s,"se encuentra en la lista")
        else:
            print("La empresa",s,"no se encuentra en la lista")
    def buscarPais(tabla,p):
        b=False
        for x in tabla.values():
            if p==x:
                b = True
                break
        if b:
            print("Se tienen empresas en el pais",p)
        else:
            print("No se tienen empresas en el pais",p)
df={}
Taller09.add(df,"Google","EEUU")
Taller09.add(df,"La locura","Colombia")
Taller09.add(df,"Nokia","Finlandia")
Taller09.add(df,"Sony","Japon")
for x,y in df.items():
    print(x," -> ",y)
Taller09.buscarEmpresa(df,"Google")
Taller09.buscarEmpresa(df,"Huawei")
Taller09.buscarPais(df,"EEUU")
Taller09.buscarPais(df,"China")

