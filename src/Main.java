import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("Enter an operation number. 1-add, 2-show, 3-remove");
            System.out.print(">>");
            String s = scanner.nextLine();
//добавить завершение при команде end
            switch (s) {
            case "1":
                System.out.println("What product would you like to add?");
                System.out.print(">>");
                String ss = scanner.nextLine();
                arrayList.add(ss);
                System.out.printf("You made purchases: %d\n", arrayList.size());
            break;
            case "2":
                System.out.println("The order list:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.printf("%d. %s\n", i+1, arrayList.get(i));
                }
            break;
              //начало повторяется как в case 2 - сделать без повторений
            case "3":
                System.out.println("The order list:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.printf("%d. %s\n", i+1, arrayList.get(i));
                }
                System.out.println("Which product would you like to remove? Input number or name?");
                //доделать удаление по имени
                String remove = scanner.nextLine();
                int i = Integer.parseInt(remove);
                arrayList.remove(i-1);
            break;
            }


        }

    }
}
