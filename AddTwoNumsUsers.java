import java.util.Scanner;
//Scanner Keyword is used for taking input from user

public class AddTwoNumsUsers {
    public static void main(String [] args){
        //void return null & main is function and starting point of the code
        int myFirstNum;
        int mySecNum;
        int result;
        Scanner in = new Scanner(System.in);
        /* new keyword is a method of java scanner class which
           finds and return the next complete token from the scanner
           which is in using.
         */
        System.out.println("Enter First Number: ");
        myFirstNum = in.nextInt();

        System.out.println("Enter second number: ");
        mySecNum = in.nextInt();

        result = myFirstNum + mySecNum;
        /* here I try to print the ouput line and result value together
        and "+" means concatenated strings.
         */
        System.out.println("Result of two number is: "+ result);
    }
}
