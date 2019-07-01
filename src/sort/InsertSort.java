package sort;

/**
 * 直接插入排序(稳定排序)
 * 反复遍历，插入到比当前值的大的前面一个位置
 * 复杂度：1+2+3+...+n
 */
public class InsertSort {

    int[] arr = {9, 3, 4, 5, 1, 7, 8, 3, 5, 7, 0, 1};

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        insertSort.sort();
        for(int v:insertSort.arr)
        System.out.println(v);
    }

    void sort() {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                //将大于temp的数后移
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }

}