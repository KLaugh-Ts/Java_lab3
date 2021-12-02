import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see Time
 */

public class Main {
    public static void main(String[] args) {

        int[] size = new int[] {5000, 50000, 100000};

        System.out.println("------------------------------------------------");
        System.out.println("\t | List size |  ArrayList  |  LinkedList  |");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            System.out.print("Add  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new Time().addTime(arrayList, size[i]));
            System.out.print("  |");
            System.out.printf("%12d", new Time().addTime(linkedList, size[i]));
            System.out.println("  |");
            System.out.println("------------------------------------------------");

            System.out.print("Get  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new Time().getTime(arrayList,  size[i]));
            System.out.print("  |");
            System.out.printf("%12d", new Time().getTime(linkedList,  size[i]));
            System.out.println("  |");
            System.out.println("------------------------------------------------");

            System.out.print("Del  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new Time().deleteTime(arrayList,  size[i]));
            System.out.print("  |");
            System.out.printf("%12d", new Time().deleteTime(linkedList,  size[i]));
            System.out.println("  |");
            System.out.println("------------------------------------------------");
        }
    }
}

