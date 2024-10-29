import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int min = in.nextInt();
        int time =in.nextInt();

        if (time + min >= 60){
            hour += (time + min) / 60;
            min = (time + min) % 60;

            if (hour >= 24){
                hour -= 24;
            }

        } else if (time + min < 60){
            min = time + min;
        }

        System.out.println(hour + " " + min);


    }
}


