package Pattern;

import java.util.Scanner;

public class Binary_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){ //rows
            for(int j=1;j<=i;j++){  //columns
                if(i==j || (i+j)%2==0 ){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
