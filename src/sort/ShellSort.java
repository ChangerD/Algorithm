package sort;

/**
 * 希尔排序（不稳定）
 */
public class ShellSort {

    int[] arr = {8, 9, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        ShellSort insertSort = new ShellSort();
        insertSort.sort();
        for (int v : insertSort.arr)
            System.out.println(v);
    }

    void sort(){
        int d = arr.length/2;
        while(true){
            for(int i=0;i<d;i++){
                for(int j=i;j+d<arr.length;j+=d){
                    int temp;
                    if(arr[j]>arr[j+d]){
                        temp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }
            }
            if(d==1){break;}
            d--;
        }
    }


}
