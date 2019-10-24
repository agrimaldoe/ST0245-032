import numpy as np
import pandas as pd
import pandas as pd
import Chefboost as chef
class node:
    def __init__(self, p,sT,sM, luz, eT, eH, lbl=None):
        self.ph=p
        self.soilT=sT
        self.soilM=sM
        self.light=luz
        self.envT=eT
        self.envH=eH
        self.label=lbl
class table:
    def __init__(self):
        self.tb={}
        self.ct=0
        self.model=None
    def insert(self,dato):
        if dato.lbl == None:
            dato.lbl=chef.predict(self.model,[dato.ph,dato.soilT,dato.soilM,dato.light,dato.envT,dato.envH])
        self.tb[self.ct]=dato
        self.ct=self.ct+1
    def delete(self,v):
        for i in range(v,self.ct):
            self.tb[i]=self.tb[i+1]
        del(self.tb[self.ct-1])
        self.ct=self.ct-1
    def buscar(self,value):
        return self.tb[value]
    def iniciar(self,st):
        datos = pd.read_csv(st)
        datos.head()
        while True:
            try:
                ph = datos.at[n,'ph']
                soilT = datos.at[n,'soil_temperature']
                soilM = datos.at[n,'soil_moisture']
                light = datos.at[n,'illuminance']
                envT = datos.at[n,'env_temperature']
                envH = datos.at[n,'env_humidity']
                label = datos.at[n,'label']
                dt=node(ph,soilT,soilM,light,envT,envH,label)
                self.insert(dt)
            except:
                break
        self.model=chef.fit(datos,{"algorithm":"CART"})
            

dtFram=table()
dtFram.iniciar("data_set.csv")
