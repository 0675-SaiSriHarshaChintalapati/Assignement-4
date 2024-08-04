//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int binarySearch(int[] arr,int t){
        int start = 0;
        int mid;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == t) {
                return mid+1;


            } else if (t< arr[mid]) {
                start=mid+1;
            } else {
                start = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int ta = 5;
        int b=binarySearch(a,ta);
        System.out.println(b);
    }
}