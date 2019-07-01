package sort;

/**
 * 二分法插入排序
 * 在直接插入排序的基础上使用二分法
 */
public class BinaryInsertSort {

    int[] arr = {8, 9, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        BinaryInsertSort insertSort = new BinaryInsertSort();
        insertSort.sort();
        for (int v : insertSort.arr)
            System.out.println(v);
    }

    void sort() {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (temp < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                //将大于temp的数后移
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            if (left != i) {
                arr[left] = temp;
            }
        }
    }

}
