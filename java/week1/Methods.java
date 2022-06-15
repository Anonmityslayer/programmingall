//functions are called methods - fuctions are just he named group of statements
/* syntax for function for now (will use access modifiers later)
            static return_type name (parameters if any)    we will use static as our main function is static
            {
                body
                return staement;
            }
while f=defining veriables used in the () are called parameters (makes sense as in real world this is the their characteristic)
but when we call the fuction stuffs in () are called arguments (makes sense as we are not setting benchmark here we are just giving what he funcyion want
                                                                            literally now we are not talking to the function so we can only argue)

calling a function
            to call function just --
name_of_function(arguments (if required) in same order as defined in the function be careful regarding order of the argements otherwise error);
*/
public static Methods
{
    public static void main(string[] args)
    {
        system.out.println("lets do some summation");
        system.out.println("sum of numbers is" + sum());  //called the function sum() here

        Scanner in = new Scanner(system.in);
        float num1 = in.nextInt();
        float num1 = in.nextInt();
        float total = sum1( a: num1 , b: num2);   //function call when function requires arguments
        system.out.println("sum of the numbers:: " + total);

    }

}

static void sum()    //sum returns nothing so its return type is void
{
    system.out.print("enter the numbers :: ");
    scanner in = new scanner(system.in);
    float num1 = in.nextInt();
    float num2 = in.nextInt();
    float sum = num1 + num2;
    system.out.println("sum is" + sum);
}

static float sum1(float a , float b)   //so this function will return a float so residual value after thsi function call will be of float type
{
    float sum = a + b ;
    return sum;      //return statement marks the. end of function execution and it also returns some vlaue for the caller function - here caller is main function
}


/*
 in java their is no such thing called "pass by reference" means java doesn't bother to use pointers explicitely like c language
but internally it uses it for achieveing rthe purpose (so implicietly paointers are used)
so java uses the concept of "PASS BY VALUE"
in case of primiticve data types "simple value of the variable is passed "
in case of derived data types "value of the reference varible is passed - actually value in reference varible is the address of
the real object.
*/

/* in case of primitive data type the actaul value (or the object) is directly passed so the parameter variable
will change only when we do change for that object itself so this object is directly not its address is in the hands of the parameter variable
but in case of reference variable the value of reference variable i.e. memory addresss of the object is passed
so anychage to the parameter variable will change the original object as both are now pointing to the same object
*/


