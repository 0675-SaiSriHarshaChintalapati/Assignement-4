import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={4,7,4,8,6,1,3,2,6};
        int target=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }

        }

    }
}