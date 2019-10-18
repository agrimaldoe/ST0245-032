import networkx as nx

f = open("doc2.txt")
f1=f.readlines()
f2=[]
for x in f1:
    f2.append(x.split(" "))
    
Gr=nx.DiGraph()
contador=0
for x in f2:
    x[0]=contador
    
    Gr.add_edge(
        x[0],x[1],peso=x[2]
    )
Gr.nodes(data=True)
