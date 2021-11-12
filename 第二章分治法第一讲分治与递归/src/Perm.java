public class Perm {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9};
        perm(list, 7, list.length - 1);
    }

    public static void perm(Object[] list, int s, int e) {
        // 产生前缀为list[0:s-1],后缀为list[s:e]的全排列的序列
        if (s == e) {
//            System.out.println(list[s]);
            for (int i = 0; i <= e; i++) {
                System.out.print(list[i]);
            }
            System.out.println();
        } else {
            for (int i = s; i <= e; i++) {
                swap(list, s, i);
                perm(list, s + 1, e);
                swap(list, s, i);
            }
        }
    }

    public static void swap(Object[] list, int s, int i) {
        Object temp = list[s];
        list[s] = list[i];
        list[i] = temp;
    }
}
