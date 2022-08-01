file = open("workgg.txt","r")

data = file.read()
beta = ""
j=0
for i in range(0 , len(data), 1):
    if(j==0 ):
        beta += data[i].upper()
        j = j+1
    elif(data[i]==" "):
        beta += data[i]
        j = 0
    else :
        beta += data[i].lower()

print(beta)
        
