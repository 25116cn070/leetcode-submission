
class Solution {

    static int pivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        if (arr[s] <= arr[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[n - 1]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;
    }

    static int binarySearch(int[] arr, int start,
                            int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;

        if (n == 0) {
            return -1;
        }

        int pivot = pivotIndex(nums);

        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }

        if (target >= nums[0] && target <= nums[pivot - 1]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }

        return binarySearch(nums, pivot, n - 1, target);
    }
}
