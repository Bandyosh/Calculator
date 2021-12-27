import java.lang.*;
import java.util.*;

public class Pythag {

    public Pythag(){

        System.out.println("Pythagorean Formula: a^2 + b^2 = c^2\n");

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter A");

        String a = myObj.nextLine(); //Response for A

        System.out.println("Enter B");

        String b = myObj.nextLine(); //Response for B

        try{

            double intA = Double.parseDouble(a);// Parse String

            double intB = Double.parseDouble(b); //Parse String

            double infoSquare = (intA*intA) + (intB*intB); //Calculation for what is inside the root

            double sqrt = Math.sqrt(infoSquare); //Does the Math

            answer = sqrt; //1st Answer

            zForm.form("Pythagorean: c = ", answer);

        } catch (NumberFormatException e) { //Catch Statement if String isn't a Int

            System.out.println("\n" + ANSI.RED() + "Invalid Input(s)\n" + ANSI.RESET()); //If you didnt use a int and wrote something random

            zForm.error();

        }



    }

    public String toString(){ //If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer;

    private String a;

    private String b;


}