public class BiSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 3;
        System.out.println(biSearch1(arr, x));
        System.out.println(biSearch2(arr, x, 0, arr.length - 1));
    }

    //二分搜索递推方法
    public static int biSearch1(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //二分搜索递归方法
    public static int biSearch2(int[] arr, int x, int l, int r) {
        int mid = (l + r) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return biSearch2(arr, x, mid + 1, r);
        } else {
            return biSearch2(arr, x, l, mid - 1);
        }
    }
}
