public class Hanoi {
    public static void main(String[] args) {
        int n = 3;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        hanoi(n, a, b, c);
    }

    public static void hanoi(int n, char a, char b, char c) {
        // 从a移动到b (借助c)
        if (n > 0) {
            hanoi(n - 1, a, c, b);
            move(a, b);
            hanoi(n - 1, c, b, a);
        }
    }

    private static void move(char a, char b) {
        System.out.println(a + " --> " + b);
    }
}
