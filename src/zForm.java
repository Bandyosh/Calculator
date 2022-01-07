import java.util.*;

public class zForm {
    static Scanner scanner = new Scanner(System.in);

    public static int Int(String color, String msg){
        console.color(color, msg);

        String responseString = scanner.nextLine();

        int x = 0;

        try{
            x = Integer.parseInt(responseString);
        } catch(NumberFormatException e){
            console.error("Invalid Input(s)");
            console.end();
        }

        return x;
    }

    public static double Double(String color, String msg){
       console.color(color, msg);

        String responseString = scanner.nextLine();

        double x = 0.0;

        try{
            x = Double.parseDouble(responseString);
        } catch(NumberFormatException e){
          console.error("Invalid Input(s)");
          console.end();

        }

        return x;
    }

    public static void Restart(){
        String responseString = String(ANSI.YELLOW(), "Do you want to play the game again? Y or N");

        if(responseString.equals("Y")){
            console.clear();
        Start start = new Start();
        } else{
            console.end();
        }
    }

    public static String String(String Color, String msg){
        console.color(Color, msg);
        return scanner.nextLine().toUpperCase(Locale.ROOT);
    }
}
