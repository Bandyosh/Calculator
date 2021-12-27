import java.util.*;
import java.io.*;

public class Start {

    public Start(){

        System.out.println(ANSI.CYAN() + "Pick a formula: Quadratic (q), Pythagorean (p), Natural Log (l), or Calculate (c)");

        Scanner myObj1 = new Scanner(System.in);

        String response = myObj1.nextLine(); //Response for Question

        System.out.println("");

        if(response.toUpperCase().equals("QUADRATIC") || response.toUpperCase().equals("Q")){

            Quad quad = new Quad();

        } else {

            if(response.toUpperCase().equals("PYTHAGOREAN") || response.toUpperCase().equals("P")){

                Pythag pythag = new Pythag();

            } else {

                if(response.toUpperCase().equals("LOG") || response.toUpperCase().equals("L")){

                    nLog log = new nLog();

                } else{

                    if(response.toUpperCase().equals("CALCULATE") || response.toUpperCase().equals("C")){

                        zCalc calc = new zCalc();

                    } else {

                        System.out.println(ANSI.RED() + "Invalid Input. \n" + ANSI.RESET());

                        zForm.error();



                    }

                }

            }

        }

    }
}