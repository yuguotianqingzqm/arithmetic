package sort;

public class SelectionSort {
    //选择排序
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-1;i++){ //i~N-1
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) { //i~N-1找最小值下标
                minIndex=arr[j]<arr[minIndex]?j:minIndex;

            }
            swap(arr,i,minIndex);
        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=tmp;
    }

    public static void main(String[] args) {
        int[] sort = {1, 3, -3, 5};
        selectionSort(sort);
        for (int i : sort) {
            System.out.print(i);
        }
    }
}
