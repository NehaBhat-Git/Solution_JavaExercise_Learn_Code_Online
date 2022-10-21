public class String_DataType {
    public static void main(String [] args)
    {
        // define a String What is String
         /*  String is a datatype which is used to store text
      or character */
        String myString = "I am a String";
        System.out.println(myString);

        String fakeValue = "22.987";
        System.out.println(fakeValue);

        String fakeValue1 = "11.7";
        System.out.println(fakeValue1 + fakeValue);  /*output will --> 11.722.987 it means they are just concatenating
                                                        the things not adding them. */
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
    }
}
