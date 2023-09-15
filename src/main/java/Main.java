import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> listOfNumbers = new ArrayList<>();
        StringBuilder stringbuilder = new StringBuilder();
        System.out.println("Podaj liczbę dodatnią");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Koniec");
        } else {
            listOfNumbers.add(number);
        }
        while (number >= 0) {
            System.out.println("Podaj kolejną liczbę dodatnią");
            number = scanner.nextInt();
            if (number >= 0) {
                listOfNumbers.add(number);
            }
        }
        int sum = 0;
        if (!listOfNumbers.isEmpty()) {
            int size = listOfNumbers.size() - 1;
            for (int i = 0; i <= size; i++) {
                sum += listOfNumbers.get(i);

                if (i != size) {
                    System.out.print(listOfNumbers.get(size - i) + ", ");
                    stringbuilder.append(listOfNumbers.get(i) + " + ");
                } else {
                    System.out.print(listOfNumbers.get(size - i));
                    stringbuilder.append(listOfNumbers.get(i));
                }
            }
            List<Integer> sortedList = new ArrayList<>(listOfNumbers);
            Collections.sort(sortedList);
            System.out.println();
            stringbuilder.append(" = " + sum);
            System.out.println(stringbuilder.toString());
            System.out.println("Najmniejsza liczba w liście to " + sortedList.get(0));
            System.out.println("Największa liczba w liście to " + sortedList.get(sortedList.size() - 1));
        } else {
            System.out.println("Lista jest pusta");
        }
    }
}
