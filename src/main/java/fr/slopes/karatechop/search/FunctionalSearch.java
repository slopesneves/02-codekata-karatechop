package fr.slopes.karatechop.search;

import java.util.stream.IntStream;

public class FunctionalSearch implements BinarySearch {
    @Override
    public int search(int elementToFind, int[] elements) {
        return IntStream
                .iterate(0, i -> i + 1)
                .limit(elements.length)
                .filter(i -> elements[i] == elementToFind)
                .findAny().orElse(-1);
    }
}
