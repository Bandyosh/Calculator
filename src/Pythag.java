import java.lang.*;


public class Pythag {

    public Pythag(){

        console.log("Pythagorean Formula: a^2 + b^2 = c^2\n");


        double a = zForm.Double(ANSI.orange(), "Enter A");


        double b = zForm.Double(ANSI.orange(),"Enter B"); //Response for B


            double infoSquare = (a*a) + (b*b); //Calculation for what is inside the root
            answer = Math.sqrt(infoSquare);; // Answer

            console.color(ANSI.GREEN(), "Pythagorean: c = " + answer);
            zForm.Restart();



    }

    public String toString(){ //If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer;

    private String a;

    private String b;


}