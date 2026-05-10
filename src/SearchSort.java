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
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
