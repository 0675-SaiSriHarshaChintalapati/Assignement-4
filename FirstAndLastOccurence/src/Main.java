//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int BinarySearch(int[] arr,int n){
        int start=0;
        int end= arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(n==arr[mid]){
                if(arr[mid]-1==n){
                    end=mid;
                    continue;
                }
                else{
                    return mid;
                }
            }
            if(n<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,3,3,4,5};
        int n=3;
        System.out.println(BinarySearch(arr,3));

    }
}