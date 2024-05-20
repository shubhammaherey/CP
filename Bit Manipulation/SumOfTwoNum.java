import java.util.Scanner;

public class SumOfTwoNum {
    static int SumOfTwo(int a,int b){
        int sum=a^b;
        int carry = (a&b)<<1;
        if(carry==0){
            return sum;
        }
        return SumOfTwo(sum, carry);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(SumOfTwo(a,b));

    }
}
