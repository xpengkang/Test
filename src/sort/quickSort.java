package sort;

public class quickSort {

    public static void main(String[] args) {
        Solution921 s = new Solution921();
        s.sortArray(new int[] {1,4,2,7,5,9});
        System.out.println(s.sortArray(new int[] {1,4,2,7,5,9}));

    }
}
class Solution921 {
    public int[] sortArray(int[] nums) {
        if(nums == null){
            return new int[0];
        }
        sort(nums, 0, nums.length-1);
        return nums;

    }

    private void sort(int[] nums, int start, int end){
        int i = start;
        int j = end;
        int flag = nums[start];

        if(start >= end){
            return;
        }

        while(i < j){
            while(i<j && nums[j] > flag){
                j--;
            }
            while(i<j && nums[i] <= flag){
                i++;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
        // nums[i]= flag;
        // nums[start] = nums[i];

        nums[start] = nums[i];//这个顺序不能反
        nums[i] = flag;

        sort(nums, start, i-1);
        sort(nums, i+1, end);


    }
}