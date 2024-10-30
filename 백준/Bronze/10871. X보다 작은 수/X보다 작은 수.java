import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);



            int n = in.nextInt();
            int x = in.nextInt();
            int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;

            if (arr[i] < x){
                System.out.println(arr[i]);
            }

            }





        }

}
