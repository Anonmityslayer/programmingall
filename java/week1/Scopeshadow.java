//scoping and shadowing
public static Scopeshadow
{
    int a = 45453; //this is known as class variable
    public static void main(string[] args)
    {
        int a = 67;       /* shadowing is a programming technique which allows us to use same varible name in
                            overlapping scopes
                            in case of class veriables and function variables we can use same variable name
                            but here local scope will override the scopw of the same varible
                            here now onwards on this function value of a will be 67 until updations
                            */

       int b;     //shadowing begins but notion of scope not
        //system.out.println(b);   will give error as varible is not initailized - effect of shadowing
        b=3;
        system.out.println(b);  //no error now
                            /* also shadowing begins as soon as we declare the variable but the notion of scope
                            some into picture only when varible is initailized
                            */

        {
            int a = 89 ;  /* not okay as if some varible is already defined in the function in which branch is
                            present the scope of varible is all over that function so we can access taht varible
                            inside any of the block but we can't define another variable with same name in the block
                            but we can easily defien other. varible in the block but its scope will be limited to that
                            block only so outside that block program has no idea about that variable so we can reuse that
                            same varibale name outside that block (following similar rule)*/
            int b = 78 ;  //okay as per above rule
        }

        int b = 3993;     //it is okay as per above rule
    }
}