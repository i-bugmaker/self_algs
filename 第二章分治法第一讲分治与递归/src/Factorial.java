public class Factorial {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(fac(x));
    }

    static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
