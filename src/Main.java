import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static <T> void show(List<T> arrayList) {
        System.out.println("The order list:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("%d. %s\n", i+1, arrayList.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("Enter an operation number or \"end\". 1-add, 2-show, 3-remove, 4-search");
            System.out.print(">>");
            String s = scanner.nextLine();
            if (s.toLowerCase().equals("end")) break;

            switch (s) {
            case "1":
                System.out.println("Enter product's name which you would like to add or input \"return\"");
                System.out.print(">>");
                String ss = scanner.nextLine();
                if (ss.toLowerCase().equals("return")) break;
                arrayList.add(ss);
                System.out.printf("You made purchases: %d\n", arrayList.size());
            break;
            case "2":
                show(arrayList);
            break;
            case "3":
                show(arrayList);
                System.out.println("Enter product's number or name you would like to remove or input \"return\"");
                String remove = scanner.nextLine();
                if (remove.toLowerCase().equals("return")) break;

                if (arrayList.remove(remove)) {
                    System.out.println("The element removed");
                } else if (Integer.parseInt(remove) > 0 &&
                    Integer.parseInt(remove) <= arrayList.size()) {
                    int i = Integer.parseInt(remove);
                    arrayList.remove(i - 1);
                    System.out.println("The element removed");
                } else System.out.println("Sorry, no matches");

                break;
                case "4":
                    System.out.println("Input a word to search or input \"return\"");
                    String search = scanner.nextLine();
                    if (search.toLowerCase().equals("return")) break;
                    arrayList.stream().filter(n -> n.toLowerCase().contains(search.toLowerCase()))
                            .forEach(n -> System.out.printf("%d. %s\n", arrayList.indexOf(n) + 1, n));
            }
        }
    }
}
