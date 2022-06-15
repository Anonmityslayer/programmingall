
//type casting and conversion

public static Typeconvandcast
{
    public static void main(string[] args)
    {
        float i = 34;
        /* java performs automatic data conversions for compatible data types if the souce's data type is smaller
        than that of the destination like here float is kindda largers than int to 34 is automatically converted to
        floating point. */
        /* int coverts to floats - okay, char --> int (using unicode encodings) - okay , short --> int okay, float --> double - okay
        float -->int not okay as float is larger than int */
        //JAVA FOLLOWS UNICODE CHARACTER ENCODING

        double f = 8 + 73 + 'a' + 83323.3939;
        float sum =(73*8.999)+('a'+93)+(45*2002);
                /* = double.   +. int.   + int ; upgradation1
                 = double;     upgradation2
        /* in an expression java automatically upgrades the type for particular operand in accordance with data type of
        other varibles */


        int n = (int)(2312312.413412);
        char k = (char)(2323);
        /* we can also convert data types which are compatible but don't undergo auto chage due to data size
        constrains. using the technique called type casting - in type casting we short of follow some soft rule
        and covert the data explisitly (in general we are doing some forceful conversions without considering
        , upto a certain level , about correectness of the data). */

    }
}