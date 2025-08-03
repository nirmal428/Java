package Pattern;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n=sc.nextInt();
        System.out.print("Enter number of columns : ");
        int m =sc.nextInt();
        for(int i=1; i<=n; i++){ //rows
            for(int j=1;j<=m;j++){  //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
