package com.yyj.algorithm.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 7, 9, 10};
        System.out.println(search(arr1, 6));
        System.out.println(search(arr1, 5));

        int[] arr2 = new int[]{1, 3, 5, 7, 9, 10, 15};
        System.out.println(search(arr2, 6));
        System.out.println(search(arr2, 9));
    }

    public static int search(int[] arr, int target) {
        if (arr.length == 0 || arr[0] > target || arr[arr.length - 1] < target) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
