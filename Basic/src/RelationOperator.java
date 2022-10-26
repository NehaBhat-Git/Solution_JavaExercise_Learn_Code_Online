public class RelationOperator {
    /* RelationalOperation are used to comparing two variables for
    equality, non-equality, greater than,less than etc
    */
    public static void main(String[] args)
    {
        int num1 = 10,num2 = 40;
        String str1 = "Value is equal", str2 ="Value is equal";
        //RelationOperator such
        //1. Equal to operator (==)
        System.out.println("Value of num1 is: "+num1+" and value of num2 is: "+num2);
        System.out.println("So Equal operator is:"+(num1 == num2));
        System.out.println("Str1 is: "+str1+"\nStr2 is: "+str2);
        System.out.println(str1==str2);

        //2. 'Not equal to' operator (!=)
        System.out.println("Not equal(!=) operator of num1 and num2 is: "+(num1!=num2));
        System.out.println("Not equal(!=) operator of str1 and str2 is: "+(str1!=str2));

        //3. Greater than operator (>)
        System.out.println("Greater operator(>) of num1 and num2 is: "+(num1>num2));
        System.out.println("Greater operator(>) of num1 and num2 is: "+(num2>num1));

        //4. 'Less than' operator(<)
        System.out.println("Greater operator(<) of num1 and num2 is: "+(num1<num2));

        //5. Greater than or equal to (>=)
        System.out.println("Greater than or equal to (>=): "+(num2>=num1));
        //6. less than or equal to(<=)
        System.out.println("less than or equal to (<=): "+(num1<=num2));





    }
}
