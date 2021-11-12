public class Egg1 {
    public static void main(String[] args) {
        int x = 1;
        // 一个一个数,判断是否满足8个条件
        while (true) {
            if (x % 2 == 1 && x % 3 == 0 && x % 4 == 1 && x % 5 == 4 && x % 6 == 3 && x % 7 == 0 && x % 8 == 1 && x % 9 == 0) {
                System.out.println(x);
                break;
            } else {
                x++;
            }
        }
    }
}
