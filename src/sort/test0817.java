package sort;

public class test0817 {
}

class Solution {
    int res = 0;//逆序对
    public int[] mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    public int mergeSort2(int[] nums) {
        int res = 0;//逆序对
        mergeSort(nums, 0, nums.length-1);
        return res;//逆序对
    }


    public void mergeSort(int[] nums, int start, int end){
        if(start>=end)
            return;
        int mid = (start + end)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, end);
    }
    public void merge(int[] nums, int start, int end){
        int[] temp = new int[end-start+1];
        int mid = (start+end)/2;
        int i=start, j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j])
                temp[k++]=nums[i++];
            if(nums[j]<=nums[i])
                temp[k++]=nums[j++];
                res = mid - 1 + 1;//逆序对
        }
        while(i<=mid)
            temp[k++]=nums[i++];
        while(j<=end)
            temp[k++]=nums[j++];
        for(int n=0;n<temp.length;n++){
            nums[n+start]=temp[n];
        }
    }


    public int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    public void quickSort(int[] nums, int start, int end) {
        if(start>=end)
            return;
        int i=start, j=end;
        int flag = nums[start];
        while(i<j){
            while(i<j && nums[j]>=flag)
                j--;
            while(i<j && nums[i]<=flag)
                i++;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
        nums[start] = nums[j];
        nums[j] = flag;

        quickSort(nums, start, i-1);
        quickSort(nums, i+1, end);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {5,9,1,2,5,6,7,0,3,4};
        int[] ans = s.mergeSort(num);
        System.out.print("归并排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(s.res);//逆序对

        ans = s.quickSort(num);
        System.out.print("快速排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();

        int[] num2 = {1,1,0};
        ans = s.mergeSort(num2);
        System.out.print("归并排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        ans = s.quickSort(num2);
        System.out.print("快速排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();

        int[] num3 = {0,0,1};
        ans = s.mergeSort(num3);
        System.out.print("归并排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        ans = s.quickSort(num3);
        System.out.print("快速排序结果：");
        for(int i: ans){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}