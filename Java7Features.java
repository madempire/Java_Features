import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7Features {
    public static void main(String[] args) {
        // 1. Try-With Resources no need to close objects try-with resources will handle these kind of things
        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){

        } catch(IOException e){
            e.printStackTrace();
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("it's"+day);
                break;
            case "Tuesday":
                System.out.println("it's"+day);
                break;
            case "Wednesday":
                System.out.println("it's"+day);
                break;
            case "Thursday":
                System.out.println("it's"+day);
                break;
            case "Friday":
                System.out.println("it's"+day);
                break;
            case "Saturday":
                System.out.println("it's"+day);
                break;
            case "Sunday":
                System.out.println("it's"+day);
                break;
            default:
                System.out.println("Enter proper day name");
                break;
        }
    }
}
