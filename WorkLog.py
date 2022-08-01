f = open("workgg.txt","r")

data  = f.read()
i=0
for k in range(1,len(data),1):
    if(data[k]!=" "):
        i = i+1
    else :
        print(i,end=" ")
        i =0
print(data)
