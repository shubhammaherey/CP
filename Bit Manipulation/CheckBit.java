import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int mask=1<<pos;
        if((n & mask)>0){
            System.out.println("1");
        } 
        else{
            System.out.println("0");
        }
    }
}
