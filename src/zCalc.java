import java.util.*;

public class zCalc {

    public zCalc(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("What Operator Will You Use? ( +, -, *, / )");

        String operator = myObj.nextLine(); //Response for Operator

        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){



            System.out.println("Calculation Formula: A " + operator + " B");

            System.out.println("Enter A");

            String a = myObj.nextLine(); //Response for A

            System.out.println("Enter B");

            String b = myObj.nextLine(); //Response for B


            try{

                double intA = Double.parseDouble(a);// Parse String

                double intB =  Double.parseDouble(b); //Parse String

                if(operator.equals("-")){

                    answer = this.subtract(intA, intB);

                    zForm.form("Calculation:", answer);

                } else {

                    if(operator.equals("+")){

                        answer = this.add(intA, intB);

                        zForm.form("Calculation:", answer);

                    } else {
                        if(operator.equals("/")){

                            answer = this.divide(intA, intB);

                            zForm.form("Calculation:", answer);

                        } else {

                            if(operator.equals("*")){

                                answer = this.multiply(intA, intB);

                                zForm.form("Calculation:", answer);

                            }

                        }

                    }

                }

            } catch (NumberFormatException e) { //Catch Statement if String isn't a double

                System.out.println("\n" + ANSI.RED() + "Invalid Input(s)\n" + ANSI.RESET()); //If you didnt use a int and wrote something random

                zForm.error();

            }

        } else {

            System.out.println("\n" + ANSI.RED() + "Invalid Input(s)\n" + ANSI.RESET()); //If you didnt use a int and wrote something random

            zForm.error();

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