import java.io.*;

import java.util.*;

public class nLog {

    public nLog(){

       String response = zForm.String(ANSI.CYAN(),"Does your natural log require a fraction?");

        if(response.equals("Y")){

            console.error("Cannot compute fractions.");

            zForm.Restart();

        } else {

            if(response.equals("N")){

                console.log("Natural Log Formula: ln(a)");

                double a = zForm.Int(ANSI.orange(), "Enter A"); //Response for A

                    answer = Math.log(a);; //Answer

                    if(Double.isNaN(answer)){

                        console.error( "Invalid Input(s)"); //If you didnt use a int and wrote something random

                        zForm.Restart();

                    } else{

                       console.color(ANSI.GREEN(), "Natural Log: ln(" + a + ") = " + answer);
                       zForm.Restart();
                }

            } else {

                console.error("Invalid Input(s)");

                zForm.Restart();

            }

        }

    }

    public String toString(){ //If Anyone Does Print This Class as a Object

        return " ";

    }

    private double answer;

    private String a;


}
