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
        List<Integer> listOfNumbers = getIntegers(scanner);
        printNumbers(listOfNumbers);
        printSum(listOfNumbers);
    }

    private static List<Integer> getIntegers(Scanner scanner) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int number;
        do {
            System.out.println("Podaj liczbę dodatnią");
            number = scanner.nextInt();
            if (number >= 0) {
                listOfNumbers.add(number);
            }
        } while (number >= 0);
        return listOfNumbers;

    }

    private static void printNumbers(List<Integer> listOfNumbers) {

        if (listOfNumbers.isEmpty()) {
            System.out.println("Lista jest pusta");
            return;
        }
        Integer max = Collections.max(listOfNumbers);
        Integer min = Collections.min(listOfNumbers);
        System.out.println("Najmniejsza liczba w liście to " + min);
        System.out.println("Największa liczba w liście to " + max);
        reverseNumbers(listOfNumbers);
    }

    private static void printSum(List<Integer> listOfNumbers) {
        int sum = 0;
        StringBuilder stringbuilder = new StringBuilder();
        int size = listOfNumbers.size() - 1;
        for (int i = 0; i <= size; i++) {
            sum += listOfNumbers.get(i);
            if (i != size) {
                stringbuilder.append(listOfNumbers.get(i) + " + ");
            } else {
                stringbuilder.append(listOfNumbers.get(i));
            }
        }
        stringbuilder.append(" = " + sum);
        System.out.println(stringbuilder.toString());
    }

    private static void reverseNumbers(List<Integer> listOfNumbers) {
        Collections.reverse(listOfNumbers);
        System.out.println(listOfNumbers);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) < listOfNumbers.size()) {
                System.out.print(listOfNumbers.get(i) + ", ");
            } else {
                System.out.print(listOfNumbers.get(i));
                System.out.println();
            }
        }
    }
}

