inp = input ('enter grade : ')
try:
    grd = float(inp)
    if grd<=1.0 and grd >=0.0 :
    try :
            if grd>= 0.9 :
                print ('A')
            elif grd>=0.8 :
                print('B')
            elif grd>=0.7 :
                print('C')
            elif grd>=0.6 :
                print('D')
            else:
                print('F')
except:
    print('bad score')

