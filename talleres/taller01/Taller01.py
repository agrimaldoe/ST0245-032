#!/usr/bin/env python
# coding: utf-8

# In[4]:


import math

class Counter():
    """counter."""
    def __init__(self, ID):
        self.ID=Id
        self.count=0
    def increase(self):
         self.count=count+1

    def increments(self):
         return self.count

    def toString(self):
        print("Id:",self.Id,"_contador:",self.count)

class Punto2D():
    """Representacion de punto en 2 dimensiones"""

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y 

    def radio_polar(self):
        return math.sqrt(x**2+y**2)

    def angulo_polar(self):
         return math.atan(self.y/self.x)

    def dist_euclidiana(self, other):
        return math.sqrt((self.x-other.x)**2+(self.y-other.y)**2)
    
class Date():
    
    def _init_(self,month,day,year):
        self.month=month
        self.day=day
        delf.year=year
    def _init_(self,date):
        """fecha en formato MM/DD/AAAA"""
        self.month=date[0:2]
        self.day=date[3:5]
        self.year=date[6,10]
    def month(self):
        return self.month
    def day(self):
        return self.day
    def year(self):
        return self.year
    def toString(self):
        return self.month,"/",self.day,"/",self.year
    def compare(self, other):
        
        if (self.year*10000+self.month*100+self.day)>(other.year*10000+other.month*100+self.day):
            print ("El",other.toString(),"es antes del",self.toString())
        elif (self.year*10000+self.month*100+self.day)<(other.year*10000+other.month*100+self.day):
            print ("El",other.toString(),"es despues del",self.toString())
        else:
            print ("El",other.toString(),"es igual al",self.toString())


# In[ ]:




