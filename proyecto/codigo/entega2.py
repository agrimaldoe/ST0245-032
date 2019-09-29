import pandas as pd
class node:
    def __init__(self, p,sT,sM, luz, eT, eH, lbl):
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
    def insert(self,dato):
        self.tb[self.ct]=dato
        self.ct=self.ct+1
    def delete(self,v):
        for i in range(v,self.ct):
            self.tb[i]=self.tb.pop(i+1)
        del(self.tb[selt.ct-1])
        self.ct=self.ct-1
    def buscar(self,value):
        return 
datos = pd.read_csv("data_set.csv")
datos.head()
dtFrame=table()
for n in range(0,455):
    ph = datos.at[n,'ph']
    soilT = datos.at[n,'soil_temperature']
    soilM = datos.at[n,'soil_moisture']
    light = datos.at[n,'illuminance']
    envT = datos.at[n,'env_temperature']
    envH = datos.at[n,'env_humidity']
    label = datos.at[n,'label']
    dt=node(ph,soilT,soilM,light,envT,envH,label)
    dtFrame.insert(dt)
 
