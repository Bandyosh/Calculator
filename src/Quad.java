import java.lang.*;
import java.util.*;

public class Quad {

    public Quad(){

        System.out.println("Quadratic Formula: Ax^2 + Bx + C = 0\n");

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter A");

        String a = myObj.nextLine(); //Response for A

        System.out.println("Enter B");

        String b = myObj.nextLine(); //Response for B

        System.out.println("Enter C");

        String c = myObj.nextLine(); //Response for C

        try{

            double intA = Double.parseDouble(a);// Parse String

            double intB = Double.parseDouble(b); //Parse String

            double intC = Double.parseDouble(c); //Parse the String

            double infoSquare = (intB*intB) - (4*intA*intC); //Calculation for what is inside the root

            if(infoSquare < 0){//Checks if root value is positive

                System.out.println("\n" + ANSI.RED() + "Quadratic: No Answer Found\n" + ANSI.RESET()); //If the stuff under the root is (-)

                System.out.println(ANSI.YELLOW() + "Do you want to input another Formula? Y or N" + ANSI.RESET());

                String inputForm = myObj.nextLine(); //Response for Question

                if(inputForm.toUpperCase().equals("Y")){

                    System.out.print("\033[H\033[2J");  //ANSI ESCAPE CODE

                    Start start = new Start();

                } else {

                    return;

                }

            }

            double sqrt = Math.sqrt(infoSquare); //Does the Math

            answer1 = (intB-sqrt)/(2*intA); //1st Answer

            answer2 = (intB+sqrt)/(2*intA); //2nd Answer

            System.out.println(ANSI.GREEN() + "Quadratic: x = " + answer1/(-1) + " and " + answer2/(-1) + ANSI.RESET() + "\n"); //System Print

            System.out.println(ANSI.YELLOW() + "Do you want to input another Formula? Y or N" +  ANSI.RESET());

            String inputForm = myObj.nextLine(); //Response for Question

            if(inputForm.toUpperCase().equals("Y")){

                System.out.print(ANSI.ESCAPE());  //ANSI ESCAPE CODE

                Start start = new Start();

            }

        } catch (NumberFormatException e) { //Catch Statement if String isn't a Int

            System.out.println("\n" + ANSI.RED() + "Invalid Input(s)\n" + ANSI.RESET()); //If you didnt use a int and wrote something random

            zForm.error();

        }



    }

    public String toString(){//If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer1;

    private double answer2;

    private String a;

    private String b;

    private String c;

    private String inputForm;

}