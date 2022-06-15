prompt = 'enter the operands\n'
x1 = input(prompt)
y1 = input (prompt)
try :
    x = int(x)
    y = int(y)
    print("division",x/y)
    print("substraction",x-y)
    print("addition",x+y)
    print("exponentiation",x ** y)
    print("quotient rounded off to nearest whole number (works lik GIF)",x//y)
    print("==",x==y)
except :
    print("concatenation",x1+y1)
    #will give traceback if one of operand is not int but for now i have no clue will solve later
    try :
        x = int(x1)
        print('string * int',x*y1)    #will print y1 x-times
    except :
        try:
            y = int (y1)
            print('string * int',x1*y)   #will print x1 y-times
        except :
            print('can''t do integer * string as int is absent' )