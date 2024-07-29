//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void binarySearch(int[] a, int t) {
        int n = a.length;
        int first = -1;
        int last = -1;
        for(int i = 0; i < n; i++) {
            if (t != a[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "
                    + first);
            System.out.println("Last Occurrence = " + last);
        } else {
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 5, 6, 7};
        int ta = 4;
        binarySearch(a,ta);
    }
}

