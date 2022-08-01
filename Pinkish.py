f = open("workgg.txt","r")
data = f.read()
g1 = open("vowel.txt","w")
g2 = open("consonent.txt","w")
k=0
str = ""
p  =True;
# true for g1 not true for g2
for i in range (1,len(data) , 1):
    if(k==0):
        print(0)
        k =k+1
        if(data[i]=="A" or data[i]=="E" or data[i]=="I" or data[i]=="O" or data[i]=="U" or data[i]=="a" or data[i]=="e" or data[i]=="i" or data[i]=="o" or data[i]=="u"):
            str+=data[i];
            print(1)
            p = True
        else:
            str+=data[i]
            p  = False
    elif(k!=0 and data[i]!=" "):
        print(2)
        str+= data[i]
        k=k+1
    elif(data[i]==" "):
        print(3)
        if(p==True):
            g1.write(str)
            g1.write(" ")
            print(str)
            print("add")
        else:
            g2.write(str)
            g2.write(" ")
            print(str)
            print("add")
        k=0
        str =""
        

f.close()
g1.close()
g2.close()
