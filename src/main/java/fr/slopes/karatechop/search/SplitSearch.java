package fr.slopes.karatechop.search;

public class SplitSearch implements BinarySearch {
    @Override
    public int search(int elementToFind, int[] elements) {
        if (elements.length == 0) {
            return -1;
        }
        return search(0, elements.length - 1, elementToFind, elements);
    }

    private int search(int minIndex, int maxIndex, int elementToFind, int[] elements) {
        int middleIndex = (maxIndex - minIndex) / 2 + minIndex;
        int evaluateElement = elements[middleIndex];
        if (evaluateElement == elementToFind) {
            return middleIndex;
        }else if(minIndex == maxIndex) {
            return -1;
        }else if(evaluateElement < elementToFind) {
            return search(middleIndex + 1, maxIndex, elementToFind, elements);
        }else {
            return search(minIndex, middleIndex - 1, elementToFind, elements);
        }
    }
}
