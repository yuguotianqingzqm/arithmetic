package sort;


import java.util.Arrays;

public class insertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //0~0有序的
        //0~i想有序
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void main(String[] args) {
        int textTime=500000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed=true;
        for (int i = 0; i < textTime; i++) {
            //调用随机方法
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            insertionSort(arr1);
            comparator(arr2);
            if(!isEqual(arr1,arr2)){
                //打印arr1
                //打印arr2
                succeed=false;
                break;
            }
        }
        System.out.println(succeed ? "Nice" : "Fucking fucked");
    }

    private static boolean isEqual(int[] arr1, int[] arr2) {
        if((arr1==null&&arr2!=null)||(arr1!=null&&arr2==null)){
            return false;
        }
        if(arr1==null&&arr2==null){
            return true;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
//对数器
    private static void comparator(int[] arr2) {
        Arrays.sort(arr2);
    }

    private static int[] copyArray(int[] arr1) {
        if(arr1==null){
            return null;
        }
        int[] res=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i]=arr1[i];
        }
        return res;
    }

    public static int[] generateRandomArray(int maxSize,int maxValue){
        //Math.random() => [0,1) 所有的小数，等概率返回一个
        //Math.random()*N => [0,N) 所有的小数，等概率返回一个
        //（int）Math.random()*N => [0,N-1] 所有的整数，等概率返回一个
        int[] arr=new int[(int)((maxSize+1)*Math.random())];//长度随机
        for (int i = 0; i < arr.length; i++) {
            //返回随机数[-maxValue~maxValue]
            arr[i]=(int)((maxValue+1)*Math.random())-(int)((maxValue+1)*Math.random());
        }
        return arr;
    }
}
