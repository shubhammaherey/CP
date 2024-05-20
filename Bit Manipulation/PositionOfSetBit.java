import java.util.Scanner;

public class PositionOfSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pos=1;
        while (n!=0) {
            
            if((n&1)==1){
                System.out.println(pos);
                break;
            }
            n>>=1;
            pos++;
        }
    }
}
