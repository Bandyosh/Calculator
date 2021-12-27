import java.io.*;

import java.util.*;

public class nLog {

    public nLog(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Does your Natural Log Contain a Fraction? Y or N\n");
        String response = myObj.nextLine(); //Response for A

        if(response.toUpperCase().equals("Y")){

            System.out.println("\n" + ANSI.RED() + "Cannot compute fractions.\n" + ANSI.RESET() + "\n");

            zForm.error();

        } else {

            if(response.toUpperCase().equals("N")){

                System.out.println("\nNatural Log Formula: ln(a)\n");

                System.out.println("Enter A\n");

                String a = myObj.nextLine(); //Response for A

                try{

                    double intA = Double.parseDouble(a);// Parse String

                    double log = Math.log(intA); //Does the Math

                    answer = log; //Answer

                    if(Double.isNaN(answer)){

                        System.out.println("\n" + ANSI.RED() + "Invalid Input(s)" + ANSI.RESET()); //If you didnt use a int and wrote something random

                        zForm.error();

                    } else

                        zForm.form("Natural Log: ln(" + intA + ") = ", answer);

                } catch (NumberFormatException e) { //Catch Statement if String isn't a Int

                    System.out.println("\n" + ANSI.RED() + "Invalid Input(s)\n" + ANSI.RESET()); //If you didnt use a int and wrote something random

                    zForm.error();

                }

            } else {

                System.out.println(ANSI.RED() + "Input Invalid." + ANSI.RESET());

                return;

            }

        }

    }

    public String toString(){ //If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer;

    private String a;


}
