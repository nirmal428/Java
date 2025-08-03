package Pattern;

import java.util.Scanner;

public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n=sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){ //rows
            for(int j=1;j<=i;j++){  //columns
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
