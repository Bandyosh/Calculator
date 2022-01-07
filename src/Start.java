import java.util.*;
import java.io.*;

public class Start {

    public Start(){

        String response = zForm.String(ANSI.CYAN(),"Pick a formula: Quadratic (q), Pythagorean (p), Natural Log (l), or Calculate (c)" );


        if(response.equals("UADRATIC") || response.equals("Q")){

            Quad quad = new Quad();

        } else {

            if(response.equals("PYTHAGOREAN") || response.equals("P")){

                Pythag pythag = new Pythag();

            } else {

                if(response.equals("LOG") || response.equals("L")){

                    nLog log = new nLog();

                } else{

                    if(response.equals("CALCULATE") || response.equals("C")){

                        zCalc calc = new zCalc();

                    } else {

                        console.error("Invalid Input(s)");

                        zForm.Restart();



                    }

                }

            }

        }

    }
}