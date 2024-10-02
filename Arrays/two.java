
public class two {
    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 6, 8, 10 };
        int target = 10;
        int result = binarySearch(numbers, target);
        if (result != -1) {
            System.err.println("The Element is :" + result);
        } else {
            System.err.println("Element not found");
        }
    }
}
