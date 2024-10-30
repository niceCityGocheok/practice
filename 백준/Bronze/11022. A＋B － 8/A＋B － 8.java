import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        int arrA[] = new int[n];
        int arrB[] = new int[n];


        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arrA[i] = a;
            arrB[i] = b;
            arr[i] = a + b;

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i + 1) + ": "+ arrA[i] + " + " + arrB[i] + " = " + arr[i]);

        }




        }


}




