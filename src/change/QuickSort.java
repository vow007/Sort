package change;
/**
 * @Description: 快速排序
 * @Author: zhujin111@foumail.com
 * @Date: 2019/8/07 14:37
 */

public class QuickSort {
    public static int  partation(int arr[],int left,int right)
    {
        if(left>right)
            return 0;
        int temp=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=temp)
            {
                right--;
            }
            arr[left]=arr[right];
            while(left<right&&arr[left]<=temp)
            {
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=temp;
        return left;
    }

    public static void quickSort(int []arr, int left, int right) {
        //数组arr空或者只有有一个元素则退出
        int dp;
        if(left<right){
            dp=partation(arr,left,right);
            quickSort(arr,left,dp-1);
            quickSort(arr,dp+1,right);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,0,2,4,6,8};
        System.out.println("排序前数组为：");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
