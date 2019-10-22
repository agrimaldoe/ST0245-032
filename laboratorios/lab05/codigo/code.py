import networkx as nx

f = open("doc.txt")
f1=f.readlines()
f2=[]
for x in f1:
    f2.append(x.split(" "))

Lista = {}

contador=0
f2.pop(0)
while not f2[0][0] == "Arcos.":
    try: 
        x = f2.pop(0)
        Lista[x[0]]=[contador,x[1],x[2]]
        contador = contador + 1
    
    except:
        continue
        
f2.pop(0)
Gr=nx.DiGraph()
for x in f2:
    
    Gr.add_edge(
        Lista[x[0]][0],Lista[x[1]][0],peso=x[2]
    )
Gr.nodes(data=True)
