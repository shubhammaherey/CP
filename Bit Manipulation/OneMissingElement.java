import java.util.Scanner;

public class OneMissingElement {
    static int computeXor(int n){
        int c=n%4;
        if(c==0){
            return(n);
        }
        else if(c==1){
            return(1);
        }
        else if(c==2){
            return(n+1);
        }
        else{
            return(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int xor1=computeXor(n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            computeXor(arr[i]);
        }
    }
}
