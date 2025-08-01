package Basic;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String st=sc.nextLine();
        System.out.println("good morning " + st);
    }
}
