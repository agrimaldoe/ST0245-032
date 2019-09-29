import pandas as pd

dta = pd.read_csv("data_set.csv")

def class_counts(rows):
    cuenta = {}
    for row in rows:
        label = row[-1]
        if label not in cuenta:
            cuenta[label]=0
        cuenta[label]+=1
    return cuenta

def imp_gini(rows):
    cuenta = class_counts(rows)
    impurity = 1
    for n in cuenta:
        chanceOfN = cuenta[n]/len(rows)
        impurity -= chanceOfN**2
    return impurity


trainingData = [
  ["Green", 3, "Mango"],
  ["Yellow", 3, "Mango"],
  ["Red", 1, "Grape"],
  ["Red", 1, "Grape"],
  ["Yellow", 3, "Lemon"],
]
print(imp_gini(trainingData))
print(class_counts(trainingData))
