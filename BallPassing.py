def passCount(input1,input2,input3):
    val=0
    d={}
    for x in range(1,input1+1):    
        d[x]=0
    d[1]=1
    n = 1
    while 1:
        
        if d[n]==int(input2):
            break
        else:
             val+=1
             if d[n]%2==1:
                 n = n+int(input3+1)
                 if n>len(d):
                     n = n-len(d)
                     d[n] = d[n] +1
                 else:
                     d[n] = d[n]+1
             else:
                 #print(n)
                 n = int(n-3)
                 if n>=1:
                     d[n] = d[n]+1
                 else:
                     n = int(len(d)+n)
                     d[n]=d[n]+1
    return val

