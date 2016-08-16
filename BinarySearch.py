n = range(1,1001)
x = int(input("Please enter a Number between 1 to 1000 "))

while n:
    pivot = int(len(n)/2)
    print(n)
    if n[int(pivot)] == x:
        print("<<<<< Value found >>>>>  ",x)
        break
    elif pivot==0:
        print("xxxxxxxxxxx Value Not found xxxxxxxxxxxx")
        break
    else:
        if n[int(pivot)]<x:
            n = n[int(pivot):]
        else:
           ## print("Inside else")
            n=n[:int(pivot)]

            
            
        
    
    
