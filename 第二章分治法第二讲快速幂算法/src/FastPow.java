public class FastPow {
    public static void main(String[] args) {
        double a = 2;
        int n = 32;
        System.out.println(exp1(a, n));
        System.out.println(exp2(a, n));
    }

    //递归算法的快速幂
    public static double exp1(double a, int n) {
        if (a == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0) {
                return exp1(a, n / 2) * exp1(a, n / 2);
            } else {
                return exp1(a, n / 2) * exp1(a, n / 2) * a;
            }
        }
    }

    //递推算法的快速幂
    public static double exp2(double a, int n) {
        int i = n;
        double b = a, s = 1.0;
        while (i > 0) {
            if (i % 2 != 0) {
                s *= b;
            }
            i /= 2;
            b *= b;
        }
        return s;
    }
}
