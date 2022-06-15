x = float(input('enter a number :'))
y = float(input('enter a number :'))
print (x>=2 and (x/y)>2)   #test for x=1 and y =0 / x=6 and y=0
#here if first condition in logical operator evaluates to false in this case it doesn"t botherws to testt second condition
#or when nothing to be gained bty evaluating rest of logical expression it stops evaluation (short_circuiting)

#guarding and short_circuting example ----

#guard evaluation is used to stop evaluation of further logics thatc an cause error
x=1
y=0
print(x>=2 and y != 0 and (x/y) > 2)
x=6
y=0
print(x>=2 and y != 0 and (x/y) > 2)    #guarding is placed as y!=0 if y=0 logical operation is not executed furthur
#print(x>=2  and (x/y) > 2   and y != 0)   #here division will take palce even if y=0 so will give error ZeroDivisionError