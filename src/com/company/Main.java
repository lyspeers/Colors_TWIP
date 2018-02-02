package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String temp1 = "", temp2 = "", temp3 = "";
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println("Are you entering a Hex code(hex) an octal code(octal) or and rgb code(rgb)");
        String type = input.next();


        if(type.equalsIgnoreCase("hex")){
            System.out.println("Please enter your number to be converted in groups of 2. ex. ff,7a,02");
            String hex = number.next();
            for(int i = 0;i<hex.length();i+=2){
                if(i<2)
                    temp1 = hex.substring(i, i+2);
                else if(i<4)
                    temp2 = hex.substring(i, i+2);
                else if(i<6)
                    temp3 = hex.substring(i, i+2);
                else
                    System.out.println("Please make sure you are imputing a valid 6 digit hex code");
            }
            System.out.println(temp1 +"," +temp2 + "," + temp3);

        }else if(type.equalsIgnoreCase("octal")){
            System.out.println("Please enter your number to be converted in groups of 3 ex. 377,255,089");
            int octal = number.nextInt();
        }else if(type.equalsIgnoreCase("rgb")){
            System.out.println("Please enter your number to be converted in groups of 3 ex. 255,65,23");
            int rgb = number.nextInt();
        }else{
            System.out.println("Please make sure you input the correct code");
        }
    }
}
