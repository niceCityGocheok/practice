import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = in.nextInt();
        int n = in.nextInt();
        int ssum = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            ssum += a * b;
        }

        if (sum == ssum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



        }


}




