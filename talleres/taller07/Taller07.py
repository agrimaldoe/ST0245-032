class Node():
    def __init__(self, obj=None, nxt = None):
        self.obj = obj
        self.nxt = nxt
        
    def __str__(self):
        return "" + self.obj

class Lsimple():
    def __init__(self):
        self.first_Node = None
        self.size=0
        
    def __void(self):
        return self.fisrt_Node == None

    def insert(self, element, index):
        size=size+1
        if not self.head:
            self.head = node(data=data)
            return
        prev = None
        curr = self.head
        x=0
        n = Node(element)
        while curr.nxt and x<index:
            prev = curr
            curr = curr.nxt
        n.nxt=curr
        if prev is None:
            self.head = n
        else:
            prev.nxt=n
        

    def size(self):
        return self.size

    def remove(self, element):
        curr = self.head
        prev = None
        while curr and curr.data != element:
            prev = curr
            curr = curr.nxt
        if prev is None:
            self.head = curr.nxt
        elif curr:
            prev.nxt = curr.nxt
            curr.nxt = None
   
    def contains(self):
