package Task;

/*
Write a program that simulates all of the java data types and then generate a message display in a console. 
Use the code file attached in this material for your reference.
*/

public class Assignment02 {
    public static void main(String[] args) {
        // Integer data types
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2147483647;
        long longNumber = 9223372036854775807L;
        System.out.println("Byte value: " + byteNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Integer value: " + intNumber);
        System.out.println("Long value: " + longNumber);

        // Floating-point data types
        float floatNumber = 3.4028235E38f;
        double doubleNumber = 1.7976931348623157E308;
        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleNumber);

        // Boolean data type
        boolean isTrue = true;
        System.out.println("Boolean value: " + isTrue);

        // Character data type
        char charValue = 'A';
        System.out.println("Character value: " + charValue);
    }

}
