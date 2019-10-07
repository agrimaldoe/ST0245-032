class Node():
    def __init__(self, name=None, size=None, author=None, nxt = None, son = None):
        self.name  = name
        self.author = author
        self.size = size
        self.nxt  = nxt
        self.son  = son
      
    def insert(self, name, size, author):
        if not self.son == None:
            curr = self.son
            while not curr.nxt==None:
                curr=curr.nxt
            curr.nxt=Node(name,size,author)
        else:
            self.son=Node(name,size,author)
        
class Direct():
    def __init__(self, name=None):
        self.root_Node = Node(name)
        
        
    def __void(self):
        return self.first_Node == None
    
    def insert(self, name, size, author , ubicacion):###El tamaño se recibe en Kb
        a=self.buscar(ubicacion)
        a.insert(name,size,author)
        
    def buscar(self,name):
        return self.buscar_aux(name,self.root_Node)
        
    def buscar_aux(self, name, curr):
        while not curr==None:
            if curr.name==name:
                return curr
            elif not curr.son==None:
                r=self.buscar_aux(name, curr.son) 
                if r.name==name:
                    return r
            curr==curr.nxt
                
        print("File not found")
        
    def cosult(self, dirr, author, size):###Si se desea buscar con cualquier autor debe enviarse como parametro "any"
        actual=self.buscar(dirr)         ###Y para cualquier tamaño se envia 0 como parametro
        curr=actual.son
        a= author=="any"
        while not curr.nxt == None:
            if a :
                if curr.size:
                    print(curr.name)
            else:
                if curr.author==author:
                    print(curr.name)
    def imprimir(self):
        curr=self.root_Node
        print(curr.name)
        curr=curr.son
        while not curr==None:
            print("├──","[",curr.author,"",curr.size,"]",curr.name)
            aux=curr.son
            while not aux==None:
                print("│   └──","[",aux.author,"",aux.size,"]",aux.name)
                aux=aux.nxt
            curr=curr.nxt
