import java.util.*;

public class zForm {



    public static void form(String formula, double answer){

        Scanner formScanner = new Scanner(System.in);

        System.out.println("\n" + ANSI.GREEN() + formula + " " + answer + ANSI.RESET() + "\n");

        System.out.println(ANSI.YELLOW() + "Do you want to input another Formula? Y or N" + ANSI.RESET());

        String inputForm = formScanner.nextLine(); //Response for Question

        if(inputForm.toUpperCase().equals("Y")){

            System.out.print(ANSI.ESCAPE());  //ANSI ESCAPE CODE

            Start start = new Start();

        } else {

            return;

        }



    }

    public static void error(){

        Scanner errorScanner = new Scanner(System.in);

        System.out.println(ANSI.YELLOW() + "Do you want to input another Formula? Y or N" + ANSI.RESET());

        String inputForm = errorScanner.nextLine(); //Response for Question

        if(inputForm.toUpperCase().equals("Y")){

            System.out.print(ANSI.ESCAPE());  //ANSI ESCAPE CODE

            Start start = new Start();

        } else {

            return;

        }

    }

}