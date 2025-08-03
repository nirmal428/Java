package Pattern;

import java.util.Scanner;

public class alphabet_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){ //rows
            for(int j=1;j<=n;j++){  //columns
                System.out.print((char)(j+64)+" ");   // 64=A ,97=a , 48=0
            }
            System.out.println();
        }
    }
}
