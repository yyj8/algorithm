package com.yyj.algorithm.arr;

//https://programmercarl.com/0027.移除元素.html#其他语言版本
public class DeleteElement {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 6, 6, 6, 7, 9, 10, 6, 6, 6};
        System.out.println(delete(arr1, 6));
    }

    public static int delete(int[] arr, int target) {
        int slowindex = 0;
        for (int fastindex = 0; fastindex < arr.length; fastindex++) {
            if (arr[fastindex] != target) {
                arr[slowindex++] = arr[fastindex];
            }
        }
        return slowindex;
    }
}
