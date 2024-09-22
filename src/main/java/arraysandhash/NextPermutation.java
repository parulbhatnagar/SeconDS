package arraysandhash;

import java.util.Arrays;

public class NextPermutation {
    // for a given array of integers, find the next permutation in ascending order
    // a = [1, 2, 3, 4, 5, 6]
    // output = [1, 2, 3, 6, 5, 4]
    public void nextPermutation() {
        Integer[] a = {1, 2, 3, 4, 5, 6};
        Integer[] b = {1, 2, 3, 6, 5, 4};

        nextPermutation(a);
        //print a
        System.out.println(Arrays.stream(a).toList());

        nextPermutation(b);
        System.out.println(Arrays.stream(b).toList());
    }

    /**
     * Solution is in three parts
     * 1. Common Prefix -  from the backside, the array will be in increasing order up to the break-point index.
     * 2.  traverse the array in the backward direction, and at the first index where arr[index] > arr[break-point], we will swap arr[index] and arr[break-point].
     * 3. mply reverse the entire right half to make it ascending.
     * @param a
     */

    public  void nextPermutation(Integer[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i]) {
                j--;
            }
            swap(a, i, j);
        }
        reverse(a, i + 1, a.length - 1);
    }

    public  void swap(Integer[] a, Integer i, Integer j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public  void reverse(Integer[] a, Integer i, Integer j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

}
