import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        int max = 0;
        int min = 0;
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        max = arr[0];
        min = arr[0];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            else if (min > arr[i]){
                min = arr[i];
            }


        }
        System.out.println(min + " " + max);
                
            }

        }




