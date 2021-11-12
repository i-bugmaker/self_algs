public class Egg3 {
    public static void main(String[] args) {
        // 除以5余4,除以2余1,所以鸡蛋数个位一定是9, 则i个位一定是3
        for (int i = 3; true; i += 10) {
            int x = 63 * i;
            if (x % 6 == 3 && x % 8 == 1) {
                System.out.println(x);
                break;
            }
        }
    }
}
