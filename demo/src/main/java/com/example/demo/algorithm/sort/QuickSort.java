package com.example.demo.algorithm.sort;

import java.math.BigInteger;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            arr[i] = random.nextInt(100);
//            System.out.println("No." + i +"   "+ arr[i]);
//        }
        int[] arr = {34, 76, 6, 74, 50, 70, 78, 40, 54, 68};

        quickSort(arr, 0, arr.length - 1);
        System.out.println("----------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("No." + i + "   " + arr[i]);
        }





    }



    /*
     * 1. 分治
     * 2. 循环结束条件 if(begin < end);
     * 3. 实际处理实在partition函数里面
     * 4. quickSort 分发任务
     * 5. 可以使用多线程来优化大数据的排序
     * */

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex  = partition(arr, begin, end);
            // 分治
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);

        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int left = begin;
        int right = end - 1;

        while (left < right) {
            while (left <right && arr[left] < pivot) {
                left++;
            }
            while (left < right &&arr[right] > pivot) {
                right --;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;
        return left;
    }


//    public static void quickSort(int[] arr, int begin, int end) {
//        if (begin < end) {
//            int partitionIndex = partition(arr, begin, end);
//            quickSort(arr, begin, partitionIndex - 1);
//            quickSort(arr, partitionIndex + 1, end);
//        }
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int pivot = arr[right];
//        int l = left;
//        int r = right - 1;
//        while (l<r) {
//            while (arr[l] < pivot) {
//                l++;
//            }
//            while (arr[r] > pivot) {
//                r--;
//            }
//            if (l < r) {
//                int temp = arr[l];
//                arr[l] = arr[r];
//                arr[r] = temp;
//            }
//        }
//        int temp = arr[right];
//        arr[right] = arr[l];
//        arr[l] = temp;
//        return l;
//    }

//    public void quickSort(int[] arr, int begin, int end) {
//        if (begin < end) {
//            int mid = partition(arr, begin, end);
//            quickSort(arr, begin, mid - 1);
//            quickSort(arr, mid + 1, end);
//        }
//    }
//
//    private int partition(int[] arr, int begin, int end) {
//        int left = begin;
//        int right = end - 1;
//        int pivot = arr[end];
//
//        while (left < right) {
//            while (arr[left] < pivot) {
//                left++;
//            }
//            while (arr[right] > pivot) {
//                right--;
//            }
//            if (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }
//
//        int temp = arr[left];
//        arr[left] = arr[end];
//        arr[end] = temp;
//
//        return left;
//    }



//    public void quickSort(int arr[], int begin, int end) {
//        if (begin < end) {
//            int partitionIndex = partition(arr, begin, end);
//
//            quickSort(arr, begin, partitionIndex - 1);
//            quickSort(arr, partitionIndex + 1, end);
//        }
//    }
//
//    private int partition(int[] arr, int begin, int end) {
//        int pivot = arr[end];
//        int i = (begin - 1);
//        for (int j = begin; j < end; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//
//                int swapTemp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = arr[i + 1];
//        arr[i + 1] = arr[end];
//        arr[end] = swapTemp;
//
//        return i + 1;
//    }

    /*
     * 1. 分治
     * 2. 循环结束条件 if(begin < end);
     * 3. 实际处理实在partition函数里面
     * 4. quickSort 分发任务
     * 5. 可以使用多线程来优化大数据的排序
     * */

//    public void quickSort(int[] array, int begin, int end) {
//        if (begin < end) {
//            int partitionIndex = partitionSort(array, begin, end);
//
//            quickSort(array, begin, partitionIndex - 1);
//            quickSort(array, partitionIndex + 1, end);
//        }
//
//    }
//
//    private int partitionSort(int[] array, int begin, int end) {
//        int pivot = array[end];
//        int i = (begin - 1);
//
//        for (int j = begin; j < end; j++) {
//            if (array[j] <= pivot) {
//                i++;
//
//                int swapTemp = array[i];
//                array[i] = array[j];
//                array[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = array[i + 1];
//        array[i + 1] = array[end];
//        array[end] = swapTemp;
//
//        return i + 1;
//    }
//
//    private int partitionSort(int[] array, int begin, int end) {
//        int pivot = array[end];
//
//        while (begin < end) {
//            if (array[begin] < pivot) {
//                begin++;
//            }
//            if (array[end] > pivot) {
//                end--;
//            }
//
//            int swapTemp = array[begin];
//            array[begin] = array[end];
//            array[end] = array[begin];
//        }
//    }



}
