import java.sql.SQLOutput;

public class Operators {
    public static void main(String [] args)
    {
        //Operators are used to perform operations on variables and values.
        /* operator are:
            "+,-,*,/,%,++,--"
         */
        int num1 = 10;
        int num2 = 20;
        int num3 = 40;

        //addition
        System.out.println("Addition:"+num1+num2+num3);

        //subtraction
        System.out.println("Subtraction: "+(num3-num2-num1));

        //multiplication
        System.out.println("Multiplication: "+num1*num2*num3);
        //division
        System.out.println("Division: "+num3/num2);
        //modulus
        System.out.println("Module: "+num2%num3);
        //increment
        num2++;
        System.out.println("Increment value is after 20 is:"+num2); //value is 21
        //decrement
        num2--; //value of num2 is 20
        System.out.println("Decrement value is : "+num2);
        System.out.println(--num2);//here value should be 19
        //for num1
        System.out.println(num1++); //first num1 was 10 and increment become 11
        System.out.println(++num1);//here num is 11, but it becomes 12 because of increment and print num1




    }
}
