import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        double arr[] = new double[n];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = in.nextInt();
            arr[i] = a;
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
            sum += arr[i];

        }
        double average = sum / n;

        System.out.println(average);

        }


    }









