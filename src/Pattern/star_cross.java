package Pattern;

import java.util.Scanner;

public class star_cross {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows : ");
    int n=sc.nextInt();
    int mid= n/2 + 1;
    for(int i=1; i<=n; i++){ //rows
        for(int j=1;j<=n;j++){  //columns
            if((i+j)==(n+1) || i==j){
                System.out.print("* ");
            }
            else System.out.print("  ");
        }
        System.out.println();
    }
}
}
