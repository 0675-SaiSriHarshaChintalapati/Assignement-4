public class Main {
    public static int binarySearchFirst(int[] arr, int target) {
        int left=0, right = arr.length - 1;
        while (left < right){
            int mid =left+(right-left)/2;
            if (arr[mid] < target) {
                left=mid + 1;
            } else {
                right = mid;
            }
        }
        return (arr[left] == target) ? left : -1;
    }

    public static int binarySearchLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (arr[right] == target) ? right : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,7,7,8};
        int target = 2;
        System.out.println(binarySearchFirst(arr, target));
    }
}