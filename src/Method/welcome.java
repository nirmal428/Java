package Method;

public class welcome {
    public static void main(String[] args) {
        System.out.println("In main Method");
        firstPattern();
        greeting();
        System.out.println(("Main method complete"));
    }

    public static void greeting(){
        System.out.println("Good Morning");
    }
    public static void firstPattern(){
        int row=0;
        while(row<5){
            System.out.print("* ");
            int i=0;
            while(i<row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
