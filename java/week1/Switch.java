public static Switch
{
    /* swich statements syntax
    switch(expression which takes multiple values)
        {
            case one of the value of expression(must be is litral not variable) :
            {
                body or activity to be performed for this case
                break; -> break terminates the switch statement entirely and it transfers the
                            the program control to the next statement also break statement in every
                            case ensures that only one case is executed in the switch statement
            }
            case another value which can be taken by the expression :
            {
                body;
                break;
            }
            ......
            ...
            ....

             default :
             {
                body;       //the default block is executed only when no the case holds or got executed.
                            their is no need to put break in default block if it is at the end of the all
                             cases but if put in the middle then it is necessary to put break; statement
             }
        }


        nested switch statement - usually have one or more switch statement under a case of another switch

        switch(expression)
        {
            case value1 -> to do;   this is modern syntax for writing cases in java here we don't need to use
                                break; statement it is kindda implicietly implemented in the syntax itself
            case value2 ->
            {
                to do
                break;
            }

            case value3 ->
            {
                switch(expression)
                {
                    case value a :
                    {
                        to fo;
                        break;
                    }
                    case value b :
                    {
                        to do;
                        break;
                    }
                    default :
                    {
                        to do;
                    }
                }
            break;
            }

            default :
            {
                to do;
            }
        }
        }


        also
        x == "word"; checks for the referenses it is like "is " in python
        x.equals("word");  here equals function only checks for the value being equal or not
*/
public static void main(string[] args)
{
    
}
}