class Nodo:
    def __init__(self, data):
        self.left = None
        self.right = None
        self.data = data

    def __repr__(self):
        return f'{self.data}'

class BinaryTree:
  def __init__(self):
      self.root = None
    
  def insertar(self, data):
    if self.root is None:          #O(1)
      self.root = Nodo(data)       #O(1)
    else:
      self.__insertar_aux(data, self.root)  #O(log2 n)+
                                            -----------
                                            #O(log2 n)

  def __insertar_aux(self, data, actual):
      if(actual.right is None or actual.left is None):
        if(data > actual.data):
          actual.right = Nodo(data)
        else:
          actual.left = Nodo(data)
       
      else:
        if(data > actual.data):
            self.__insertar_aux(data, actual.right)
        else:
            self.__insertar_aux(data, actual.left)
      return actual
       

    # ------------------------------------------------------    
  def buscar(self, data):
      return self.__buscar_aux(data, self.root) #O(log2 n)

  def __buscar_aux(self, data, actual):
      if(actual is None):
          return False
      else:
          if(data == actual.data):
              return True
          else:
              if(data > actual.data):
                  return self.__buscar_aux(data, actual.right)
              else:
                  return self.__buscar_aux(data, actual.left)
      
     
  def imprimir(self):
      self.__imprimir_aux(self.root)
        
  def __imprimir_aux(self, actual):
      if actual is not None:
          self.__imprimir_aux(actual.left)
          print(actual.data)
          self.__imprimir_aux(actual.right)
  
       
 


b = BinaryTree()
b.insertar(4)
b.insertar(3)
b.insertar(5)
print(b.buscar(3))
b.imprimir()
