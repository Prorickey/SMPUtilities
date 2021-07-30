package me.prorickey.smputilities.utils;

public class Array {
    public static int[] removeTheElement(int[] arr, int index) {

        if (arr == null  || index < 0  || index >= arr.length) {
            return arr;
        }

        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }
}
