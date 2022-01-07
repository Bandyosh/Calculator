import java.util.*;

public class zCalc {

    public zCalc(){



       String operator = zForm.String(ANSI.CYAN(), "What Operator Will You Use? ( +, -, *, / )");


        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){

            console.log("Calculation Formula: A " + operator + " B");


            Double a = zForm.Double(ANSI.orange(), "Enter A");

            Double b = zForm.Double(ANSI.orange(), "Enter A");


                if(operator.equals("-")){

                    answer = subtract(a, b);

                    console.color(ANSI.GREEN(), "Calculation: " + answer);

                } else {

                    if(operator.equals("+")){

                        answer = add(a,b);

                        console.color(ANSI.GREEN(), "Calculation: " + answer);

                    } else {
                        if(operator.equals("/")){

                            answer = divide(a, b);

                            console.color(ANSI.GREEN(),  "Calculation: " + answer);

                        } else {

                                answer = multiply(a, b);

                                console.color(ANSI.GREEN(), "Calculation: " +  answer);

                        }

                    }

                }
            zForm.Restart();


        } else {

           console.error("Invalid Input(s)");

            zForm.Restart();

        }
    }

    private static double add(double a, double b){

        return a + b;

    }

    private static double subtract(double a, double b){

        return a - b;

    }

    private static double divide(double a, double b){

        return a / b;

    }

    private static double multiply(double a, double b){

        return a * b;

    }

    public String toString(){

        return " ";

    }

    private double answer;

}