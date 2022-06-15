inp = input("type something (to know the type of it) : ")
#sementic error as input fuc always returns string so type will always bre string so the program will not function as intendrd by the user
try :
    for i in inp :
        print(i)
        fl = float(inp)
    print("type of input is " ,type(fl))
except :
    print("type of input is " ,type(inp))

