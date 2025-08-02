package Method;

public class BinaryToDecimal {
    public static void main(String[] args) {
        binToDec(1111);
    }
    public static void  binToDec(int binum){
        int pow=0;
        int decnum=0;

        while(binum>0){
            int lastDigit = binum%10;
            decnum=decnum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binum=binum/10;
        }
        System.out.println("decimal of "+binum+" is  = " +decnum);
    }
}
