package Simulation;
// working with variables and data types
// variable declaration, assignment, and initialization

public class Java02 {
     public static void main(String[] args) {
        
        int x;      //declaration
        x = 100;    //assignment
        
        int y = 123;  //initialization
        
        System.out.print("x = " + x + "\ny = " + y);
        
        //other data types
        //primitive data types
        boolean isPerson = true;
        byte num1 = 127;            //byte positive max number
        byte num2 = -128;           //byte negative max number
        short num3 = 32_767;        //short positive max number with _ as delimeter
        int num4 = 123456780;
        long num5 = 123123243513235413L;  //long numbers denoted with L postfix
        
        float num6 = 123.5123f;     //float numbers denoted with f postfix
        double num7 = 123.532423631323;  //fractional numbers with more precision with double
        
        char gender = 'M';
        
        //reference data types
        String marStatus = "Married";
        
        System.out.println();
        System.out.print("\nI am a person: " + isPerson + "\n");
        System.out.print("\nSeries of Numbers:\n" + num1 + "\n" + num2 + "\n" + num3 + "\n");
        System.out.print(num4 + "\n" + num5 + "\n" + num6 + "\n" + num7 + "\n");
        System.out.print("\nMale = " + gender + "\nMarital Status: " + marStatus + "\n");
        
        //examining variable data/value status
        String text1 = "Hello";
        String text2 = "World";
        System.out.print("\nText1 = " + text1 + "\t\tText2 = " + text2 + "\n");
        
        text1 = text2;
        System.out.print("New Text1 = " + text1 + "\tNew Text2 = " + text2 + "\n");
        
        //switching values/data
        int n1 = 7;
        int n2 = 4;
        int tempNum;    //can also be set as int tempNum = 0;
        //System.out.print("\nNum1 = " + n1 + "\tNum2 = " + n2 + "\tTempNum = " + tempNum); //tempNum error as it is not initialized
        System.out.print("\nNum1 = " + n1 + "\tNum2 = " + n2 + "\tTemporary Value is not initialized!");
        
        tempNum = n2;
        n2 = n1;
        n1 = tempNum;
        System.out.print("\nNum1 = " + n1 + "\tNum2 = " + n2 + "\n");
    }
}
