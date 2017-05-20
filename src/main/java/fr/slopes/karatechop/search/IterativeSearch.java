package fr.slopes.karatechop.search;

public class IterativeSearch implements BinarySearch {

    private static final int ELEMENT_NOT_FOUND = -1;

    @Override
    public int search(int elementToFind, int[] elements) {
        int i = 0;
        while (i < elements.length) {
            if (elementToFind == elements[i]) {
                return i;
            }
            i++;
        }
        return ELEMENT_NOT_FOUND;
    }
}
