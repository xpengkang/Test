package test;
import java.util.*;
public class Solution4 {


    public static void main(String[] args) {

        Solution4 s = new Solution4();
        double res = s.findMedianSortedArrays(new int[]{0,4,5}, new int[]{1,2,3});
        System.out.println("res = "+ res);
    }

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int a = nums1.length + nums2.length;
            int[] numsAll = new int[a];
            int k = 0;


            //如果其中一个数组为nulll
            if(nums1.length == 0){
                if(nums2.length % 2 == 0){
                    //偶数
                    return (nums2[nums2.length/2] + nums2[nums2.length/2 - 1])/2.0;//double,0.0
                }else{

                    return nums2[nums2.length / 2];
                }
            }

            if(nums2.length == 0){
                if(nums1.length % 2 == 0){
                    //偶数
                    return (nums1[nums1.length/2] + nums1[nums1.length/2 - 1])/2.0;//double,0.0
                }else{

                    return nums1[nums1.length / 2];
                }
            }



            int i = 0, j = 0;
            //合并数组,归并
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] <= nums2[j]) {
                     numsAll[k++] = nums1[i++];
                }else {
                    numsAll[k++] = nums2[j++];
                }

            }

            if(i < nums1.length){
                numsAll[k++] = nums1[i++];
            }
            if(j < nums2.length){
                numsAll[k++] = nums2[j++];
            }


//            for(int i = 0; i < nums1.length; i++){
//                numsAll[k++] = nums1[i++];
//            }
//
//            int k1 = nums1.length;
//            for(int j = 0; j < nums2.length; j++){
//                numsAll[k1++] = nums2[j++];
//            }
//
//            Arrays.sort(numsAll);

            if(numsAll.length % 2 == 0){
                //偶数
                return (numsAll[numsAll.length/2] + numsAll[numsAll.length/2 - 1])/2.0;
            }else{

                return numsAll[numsAll.length/2];
            }





        }
    }

