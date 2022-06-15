//primitive data types and simple sum
public static Sum
{
    public static void main(string[] args)
    {
        System.out.println("enter the numbers to be added :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.next.Int();
        int sum = a+b;
        System.out.println("sum of the numbers =" + sum);


    //premitive data types are those which can't be furthur sub divided
    int smallintegers = 22234; //4 bytes
    float smalldecimals = 3423.343f; /* 4 bytes all decimal values are by default considered as of double type
                                    so to store smaller decimal numbers we use float data type and we put letter 'f'
                                    at the end of the number as a language syntax which in turn allows compiler to
                                    persive that number as of float data type. */
    long largeintegers = 3423423423432423;   /* 8 bytes as all integers in java are considered as of type int
                                 so to store larger integers we use long and in order to tell the compiler
                                 that we want number to be considered to be of type long we put letter 'l' at the
                                 end of number */
    double largedecimals = 346234236346238.234627;
    boolean true_false = true;  // 1 byte
    char characters = 's';   // 1 byte
    }
}