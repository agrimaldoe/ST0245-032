import numpy as np
import pandas as pd
import pandas as pd
import Chefboost as chef
class Node:
    def __init__(self, p,sT,sM, luz, eT, eH, lbl=None):
        """Constructor method of the node class
        Parameters:
        p -- value of hte ph of the batch we are going to save
        sT -- value of the soil Temperature of the batch we are going to save
        sM -- the Amount of soil Moisture the batch we are going to save
        luz -- Amount of light of the batch we are going to save
        eT -- value of the enviroment Temperature of the batch we are going to save
        eH -- Amount of humidity od the enviromento of the batch we are going to save
        lbl -- variable that tells if the batch has or not Coffee leaf Rust"""
        self.ph=p
        self.soilT=sT
        self.soilM=sM
        self.light=luz
        self.envT=eT
        self.envH=eH
        self.label=lbl
class Table:
    def __init__(self):
        """Constructor Method from the table class, which is where we are goint to keep our records """
        self.tb={}
        self.ct=0
        self.model=None
    def insert(self,dato):
        """Method to insert a record to the table and where we predict the apearence of Coffee leaf rust"""
        if dato.label == None:
            dato.label=chef.predict(self.model,[dato.ph,dato.soilT,dato.soilM,dato.light,dato.envT,dato.envH])
            print(dato.label)
        self.tb[self.ct]=dato
        self.ct=self.ct+1
    def delete(self,v):
        """Method to delete a record from the table where we are keeping them"""
        for i in range(v,self.ct):
            self.tb[i]=self.tb[i+1]
        del(self.tb[self.ct-1])
        self.ct=self.ct-1
    def search(self,value):
        """Method to search a record from the table"""
        return self.tb[value]
    def begin(self,st):
        """Method to create a decision tree based on a data set and where we insert every record form the data set to the table where we keep them"""
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
            

dtFram=Table()
dtFram.begin("data_set_balanced.csv")
dato1=Node(6.23,27,19.2,1204,36,42)
dtFram.insert(dato1)
