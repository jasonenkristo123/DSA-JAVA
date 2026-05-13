public class SearchSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int result = linearSearch(array, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } 
        }
        return  -1;
    }
}


class BinarySearch {
    public static void main(String[] args) {
        int [] arrays = {10, 4, 540, 3, 5, 9};
        int target = 5;
        int result = binarySearching(arrays, target);
        System.out.println(result);
    }

    static int binarySearching(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }
        return index;
    }
}


class SortNSearch {
    public static void main(String[] args) {
        
    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}