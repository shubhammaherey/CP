import java.util.Scanner;

public class ConverAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a^b;
        int cnt=0;
        while(c!=0){
            if((c&1)==1){
                cnt++;
            }
            c>>=1;
        }
        System.out.println(cnt);
    }
}
