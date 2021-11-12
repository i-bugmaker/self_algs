public class Ackerman {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(ackerman(n, m));
    }

    static int ackerman(int n, int m) {
        if (n == 1 && m == 0) {
            return 2;
        } else if (n == 0 && m >= 0) {
            return 1;
        } else if (n >= 2 && m == 0) {
            return n + 2;
        } else if (n >= 1 && m >= 1) {
            return ackerman(ackerman(n - 1, m), m - 1);
        } else {
            return -1;
        }
    }
}
