import java.sql.SQLOutput;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello world!"); //this code line will print output
        /* What is Variable?
        Variable is a container which store the data values while java
        program is executed*/

        int age =20;
        System.out.println(age);
        /*here int is data type of varaible
        age is variable_name and
        20 is value of variable
         */

        int score = 50;
        /* We can also write it has
        int score;   //declaration
        score = 50;  // initialization
         */

        // int finalMarioScore = 20 * 50; OR
        int finalMarioScore = age * score;
        System.out.println(finalMarioScore);
    }
}
