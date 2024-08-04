import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8, 9,9));
        printDuplicates(list);
    }

    public static void printDuplicates(ArrayList<Integer> list) {
        System.out.println("Duplicate elements in the list are:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }
    }
}
