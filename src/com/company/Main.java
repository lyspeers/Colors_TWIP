package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int temp1 = 0, temp2 = 0, temp3 = 0;
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println("Are you entering a Hex code(hex) an octal code(octal) or and rgb code(rgb)");
        String type = input.next();


        if(type.equalsIgnoreCase("hex")){
            System.out.println("Please the R group of your hex code");
            temp1 = number.nextInt(16);
            System.out.println("Please the G group of your hex code");
            temp2 = number.nextInt(16);
            System.out.println("Please the B group of your hex code");
            temp3 = number.nextInt(16);

            System.out.println(temp1 +"," +temp2 + "," + temp3 + " This is your rgb color code");
            System.out.println(Integer.toOctalString(temp1) +"," +Integer.toOctalString(temp2) + "," + Integer.toOctalString(temp3) + " This is your octal code");

        }else if(type.equalsIgnoreCase("octal")){
            System.out.println("Please the R group of your octal code");
            temp1 = number.nextInt(8);
            System.out.println("Please the G group of your octal code");
            temp2 = number.nextInt(8);
            System.out.println("Please the B group of your octal code");
            temp3 = number.nextInt(8);

            System.out.println(temp1 +"," +temp2 + "," + temp3 + " This is your rgb color code");
            System.out.println("#" + Integer.toHexString(temp1) + Integer.toHexString(temp2) +   Integer.toHexString(temp3) + " This is your hex code");

        }else if(type.equalsIgnoreCase("rgb")){
            System.out.println("Please the R group of your code");
            temp1 = number.nextInt();
            System.out.println("Please the G group of your code");
            temp2 = number.nextInt();
            System.out.println("Please the B group of your code");
            temp3 = number.nextInt();

            System.out.println(Integer.toOctalString(temp1) +"," +Integer.toOctalString(temp2) + "," + Integer.toOctalString(temp3) + " This is your octal code");
            System.out.println("#" + Integer.toHexString(temp1) + Integer.toHexString(temp2) +   Integer.toHexString(temp3) + " This is your hex code");

        }else{
            System.out.println("Please make sure you input the correct code");
        }
    }
}
