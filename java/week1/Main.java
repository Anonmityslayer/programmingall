//here public means that Main class is public it means that it is accessible from any other classes and packages
//static means something which is independent of objects like population property of human object is independent of all objects or same for all object
//static can work with other static so other functions which is used in this class should be static
//Main is the name of the class and name of public class in a file should be same as file name also every .java file is a class itself.
//classes name should start with capital letter (a part of good practise but no compulsan)
public static Main
{
    public static void main(String[] args)    //compiler looks for the main function to begin its compilation process so main function must be present
                                            //main function takes an array of strings as an argument it stores command line inputs to the program
                //main's return type is void
    {
        System.out.println("hello java world");
        /* System is a class and out is a variable in that class and println is a method over out variable
        basically out variable is used to decide the output destination by default out value is such that output destination is command line
        println() prints the argument and a newline(basically it uses escape sequence to indicate end of line)
        but print() only prints the argument */
        Scanner input = new Scanner(System.in);
        /*Scanner is a class we are declaring and initializing a reference variable 'input'
        here new keyword is used to create new object and Scanner() is a constructor of the class Scanner
        constructor Scanner takes "stream of input" as its argument here System.in indicates that input will be taken from keyboard
        */
        System.out.print("enter a number of your choice :");
        int num = input.nextInt();   // .nextInt is one of many methods defined in the class Scanner that can be used over its object
        System.out.println("number you entered is " + num);  //+ concatinates
    }
}