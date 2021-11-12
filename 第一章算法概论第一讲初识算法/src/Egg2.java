public class Egg2 {
    public static void main(String[] args) {
        int x = 63;
        // 1 3 7 9 的最小公倍数是63, 从63开始每次递增63
        while (true) {
            if (x % 2 == 1 && x % 4 == 1 && x % 5 == 4 && x % 6 == 3 && x % 8 == 1) {
                System.out.println(x);
                break;
            } else {
                x += 63;
            }
        }
    }
}
