public class Gcd {
    static int gcd(int m, int n) {
        int t = Math.min(m, n);
        while (true) {
            if (m % t == 0 && n % t == 0) {
                return t;
            } else {
                t--;
            }
        }
    }
}

