import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void show(List arrayList) {
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
                System.out.println("What product would you like to add?");
                System.out.print(">>");
                String ss = scanner.nextLine();
                arrayList.add(ss);
                System.out.printf("You made purchases: %d\n", arrayList.size());
            break;
            case "2":
                show(arrayList);
            break;
            case "3":
                show(arrayList);
                System.out.println("Which product would you like to remove? Input number or name?");
                String remove = scanner.nextLine();
                    try {
                        int i = Integer.parseInt(remove);
                        arrayList.remove(i-1);
                        continue;
                    } catch (Exception e) {}                    //?пустой catch
                    arrayList.remove(remove);
                break;
                case "4":
                    System.out.println("Input a word to search");
                    String search = scanner.nextLine();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i).toLowerCase().contains(search.toLowerCase())) {
                            System.out.printf("%d. %s\n", i+1, arrayList.get(i));
                        }
//                        добавить что если ничего не найдено то ничего не найдено
//                        добавить кнопку возврата в главное меню
                    }
                    break;
            }
        }
    }
}
