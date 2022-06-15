try:
    hours=float(input('enter hour :'))
    rate=float(input('enter rate :'))

    if hours>40 :
        print('pay :',(40*rate)+((hours-40)*rate*1.5))
    else :
            print('pay : ',(hours*rate))
except:
    print('error,please enter numeric input')
