package sort;

public class JiShu {
    //找数组中出现奇数次的一个数
    //或运算 两块内存不一样
    static void printOddTimes(int[] arr){
        int eor=0;
        for(int cur:arr){
            eor ^=cur;
        }
        System.out.println(eor);
    }
    //找数组中出现奇数次的两个数
    //或运算 两块内存不一样
    static void printOddTimes2(int[] arr){
        int eor=0;
        for(int cur:arr){
            eor ^=cur;
        }
        //eor=a^b
//        eor!=0;
//        eor必然有一个位置上是1
        //~取反
        int rightOne=eor&(~eor+1);//提取出最右的1,其他位置都是0
        int onlyOne=0;
        for (int cur : arr) {
            if((cur & rightOne)==0){
                onlyOne ^=cur;
            }
        }
        System.out.println(onlyOne+ "" +(eor ^ onlyOne));
    }
    public static void main(String[] args) {
        printOddTimes(new int[]{1,2,3,3,3,1});
        printOddTimes2(new int[]{1,2,3,3,3,1});
    }
}
