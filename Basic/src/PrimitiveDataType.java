public class PrimitiveDataType {
    public static void main(String[] args){
        System.out.println("*** Data Primitive Type ***");
        /*
            Data Type are(Primitive data type):

            Data Type                 Size
            byte                     -128 to 127
            short                    -32,768 to 32,767
            int                      -2,147,483,648 to 2,147,483,647
            long                     -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float                    -231.2f
            double                   -231.23
            boolean                   true/false
            char                     'z' (stores a single character/letter or ASCII values)
        */
        byte myByte = 55;
        System.out.println(myByte);

        int myInt = 2345;
        float myfloat = 22/7f;        /* why are we using "f" in the end of this because if we didn't
                                      use it will give 00 after decimal. which is not the exact value */
        double mydouble = 225/7d;    //same as double also
        System.out.println("Int value is: "+ myInt);
        System.out.printf("Float value is: %.2f\n",myfloat);    /* why is there "printf" because we are using
                                                                 "%.2f". what does "%.2f" it will print the 2 decimal
                                                                 after the point. we can also write with 3,4 etc */
        System.out.printf("Double value is: %.4f\n",mydouble);   // same as double

        boolean isActive = false;
        System.out.println(isActive);
        boolean isrespond = true;
        System.out.println(isrespond);

        char mchar = 'a';
        String myValue = Integer.toHexString(mchar);
        System.out.println(myValue);

        // other ASCII Value
        char myChar2 = '%';
        String myValue1 = Integer.toHexString(myChar2);
        System.out.println(myValue1);

        // ASCII Value to Alphabet
        char myUnicode = '\u0041';
        System.out.println(myUnicode);
        char myUnicode1 = '\u002f';
        System.out.println(myUnicode1);
        char myUnicode2 = '\u0080';
        System.out.println(myUnicode2);
    }

}
