public class CountSetFrom1ton {
    public static int countBit(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 2 == 0 ? 0 : 1) + countBit(n>>1);
    }

    public static void main(String[] args) {
        int n = 4, count = 0;
        for (int i = 1; i <= n; i++) {
            count += countBit(i);
        }
        System.out.println(count);
    }
}