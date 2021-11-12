public class ChickenAndRabbit1 {
    public static void main(String[] args) {
        for (int x = 0; x <= 25; x++) {
            int y = 40 - x;
            if (4 * x + 2 * y == 100) {
                System.out.println("兔有" + x + "只,鸡有" + y + "只");
                break;
            }
        }
    }
}
