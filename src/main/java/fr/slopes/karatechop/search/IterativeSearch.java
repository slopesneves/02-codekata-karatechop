package fr.slopes.karatechop.search;

public class IterativeSearch implements BinarySearch {
    @Override
    public int search(int elementToFind, int[] elements) {
        int i = 0;
        while (i < elements.length) {
            if (elementToFind == elements[i]) {
                return i;
            }
            i++;
        }

        return -1;
    }
}
