import java.util.Scanner;

public class Invertbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int mask=1<<pos;
        n=n ^ mask;
            System.out.println(n);

    }
}
