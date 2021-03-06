class Node():
    def __init__(self, obj=None, nxt = None):
        self.obj = obj
        self.nxt = nxt

class Lsimple():
    def __init__(self, size=0):
        self.first_Node = None
        self.size=size
        
    def __void(self):
        return self.fisrt_Node == None

    def insert(self, element, index):
        self.size=self.size+1
        n = Node(element)
        if index>self.size:
            curr=self.first_Node
            n.nxt=curr
            self.first_Node = n
            return
        if not self.first_Node:
            self.first_Node = Node(obj=element)
            return
        prev = None
        curr = self.first_Node
        x=0
        
        while curr.nxt and x<index:
            prev = curr
            curr = curr.nxt
            x=x+1
        n.nxt=curr
        if prev is None:
            self.first_Node = n
        else:
            prev.nxt=n
        

    def size(self):
        return self.size

    def remove(self, element):
        curr = self.first_Node
        prev = None
        while curr and curr.obj != element:
            prev = curr
            curr = curr.nxt
        if prev is None:
            self.head = curr.nxt
        elif curr:
            prev.nxt = curr.nxt
            curr.nxt = None
   
    def contains(self,element):
        curr = self.first_Node
        cont=0
        while curr and curr.obj != element:
            cont=cont+1
            curr = curr.nxt
        if curr.obj == element: 
            return cont
        else:
            print("No se encuentra el elemento")
    def print_list( self ):
        node = self.first_Node
        print(node.obj, end = "")
        node = node.nxt
        while node != None:
            print(" => ",node.obj, end ="")
            node = node.nxt
        print(" ")
###*La complejidad del metodo insert al ser de O(n) permitiria que este memtodo se usara para un editor de texto aunque lo ideal seria buscar un método que nos permitiera hacerlo con una complejidad de O(log n) o incluso menor
###*La complejidad para agregar n caracteres seria Sumatoria desde 0 hasta n de n y la complejidad para garegar a una cadena de n caracteres es de O(n)
