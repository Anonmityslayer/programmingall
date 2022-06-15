num = int(input('enter the natural number :'))
if num%2 == 0 :
    print('num is even')
else :
    print('num is odd')


#elif

marks= float(input('enter your marks :'))
if marks>80 and marks<=100 :
    print('excellent scrore')
elif marks>60 and marks<=80 :
    print('good score')
elif marks>40 and marks <=60 :
    print('avrage marks')
else :
    print('below average')     #ELSE clause if present it should be at the end
#elif marks<30 :    #elif is not permitted after else clause in these cases so it will give syntax error
 #   print('fail')


 #nested conditinals

inp1 = int (input( 'enter a num : '))
inp2 = int (input( 'enter a num : '))
if inp1==inp2 :
     printf('both are equal')
else :
    if(inp1 > inp2) :
        print('inp1 is greater than inp2')
    else :
        print('inp2 is greater than inp1')