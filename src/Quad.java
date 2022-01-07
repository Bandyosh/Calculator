import java.lang.*;
import java.util.*;

public class Quad {

    public Quad(){

        console.log("Quadratic Formula: Ax^2 + Bx + C = 0\n");


         Double a  = zForm.Double(ANSI.orange(), "Enter A"); //Response for A


        Double b  = zForm.Double(ANSI.orange(), "Enter B"); //Response for A


        Double c  = zForm.Double(ANSI.orange(), "Enter C"); //Response for A




            double infoSquare = (b*b) - (4*a*c); //Calculation for what is inside the root

            if(infoSquare < 0){//Checks if root value is positive

                console.error("Quadratic: No Answer Found"); //If the stuff under the root is (-)
                zForm.Restart();

            }

            double sqrt = Math.sqrt(infoSquare); //Does the Math

            answer1 = (b-sqrt)/(2*a); //1st Answer

            answer2 = (b+sqrt)/(2*a); //2nd Answer

           console.color( ANSI.GREEN(), "Quadratic: x = " + answer1/(-1) + " and " + answer2/(-1)); //System Print
        zForm.Restart();

        }



    public String toString(){//If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer1;

    private double answer2;


}