import java.util.Scanner;

public class ComputeXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=n%4;
        if(c==0){
            System.out.println(n);
        }
        else if(c==1){
            System.out.println(1);
        }
        else if(c==2){
            System.out.println(n+1);
        }
        else{
            System.out.println(0);
        }
    }
}
