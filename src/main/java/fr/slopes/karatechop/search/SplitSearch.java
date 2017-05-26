package fr.slopes.karatechop.search;

public class SplitSearch implements BinarySearch {

    private static final int ELEMENT_NOT_FOUND = -1;

    @Override
    public int search(int elementToFind, int[] elements) {
        if (elements.length == 0) {
            return ELEMENT_NOT_FOUND;
        }
        return search(0, elements.length - 1, elementToFind, elements);
    }

    private int search(int minIndex, int maxIndex, int elementToFind, int[] elements) {
        while (true) {
            int middleIndex = (maxIndex - minIndex) / 2 + minIndex;
            int evaluateElement = elements[middleIndex];
            if (evaluateElement == elementToFind) {
                return middleIndex;
            }else if(minIndex == maxIndex) {
                return ELEMENT_NOT_FOUND;
            }else if(evaluateElement < elementToFind) {
                minIndex = middleIndex + 1;
            }else {
                maxIndex = middleIndex - 1;
            }
        }

    }
}
