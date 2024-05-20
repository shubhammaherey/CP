import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n!=0){
            if((n&1)==1){
                cnt++;
            }n>>=1;
        }
        if(cnt==1){
            System.out.println("Power of Two");
        }
        else{
            System.out.println("Not power of Two");
        }
    }
}