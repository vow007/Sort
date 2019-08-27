package change;

/**
 * @Description:  冒泡排序
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *
 * @Author: zhujin111@foumail.com
 * @Date: 2019/8/07 14:46
 */

public class BubbleSort {
    public  static int[]  bubbleSort(int arr []) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {          //外层循环控制排序趟数
            for (int j = 0; j < len-1 - i; j++) {
                //内层循环控制每一趟排序多少次.
                // 我们在上一次循环的时候已经对于 arr.Length - 1 - i之前的位数进行排序过 不用再进行无用的循环
                if (arr[j] > arr[j+1]) {           // 相邻元素两两对比
                    int temp = arr[j+1];           // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,0,2,4,6,8};
        System.out.println("排序前数组为：");
        for (int i:arr) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        bubbleSort(arr);
        for (int i:arr) {
            System.out.print(arr[i]+" ");
        }
    }
}


