package ua.hw.common;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> numbers = new CustomList();
        fillWithNumbers(numbers);
        ListIterator<Integer> iterator = numbers.listIterator();
        printListContent(iterator);
        printListContentReversed(iterator);
        filterList(iterator);
    }

    private static void filterList(ListIterator<Integer> iterator) {
        //remove every second element
        boolean remove = false;
        while (iterator.hasNext()) {
            iterator.next();
            if (remove) {
                iterator.remove();
            }
            remove = !remove;
        }
    }

    private static void printListContentReversed(ListIterator<Integer> iterator) {
        System.out.println("reverse:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    private static void printListContent(ListIterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void fillWithNumbers(Collection<Integer> numbers) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(1000));
        }
    }
}
