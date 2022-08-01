f = open("workgg.txt","r")
data = f.read()
g1 = open("vowel.txt","w")
g2 = open("consonent.txt","w")
pgp = data.split()
for i in pgp:
    print(i[0])
    if(i[0]=="A" or i[0]=="E" or i[0]=="I" or i[0]=="O" or i[0]=="U" or i[0]=="a" or i[0]=="e" or i[0]=="i" or i[0]=="o" or i[0]=="u"):
        g1.write(i)
        
    else:
        g2.write(i)
        
    
f.close()
g1.close()
g2.close()
