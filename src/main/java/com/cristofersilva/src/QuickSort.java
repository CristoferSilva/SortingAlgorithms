package com.cristofersilva.src;
import com.cristofersilva.src.interfaces.ISortingAlgorithms;

public class QuickSort<T extends Comparable<T>> implements ISortingAlgorithms<T> {
    @Override
    public T[] sort(T[] elements) {
        return quickSort(0,elements.length - 1 ,elements);
    }
    private T[] quickSort(int leftIndex, int rightIndex, T[] elements){
        T pivot = elements[leftIndex], cache;
        int initialRightIndex = rightIndex, initialLeftIndex = leftIndex;

        while (leftIndex <= rightIndex) {
            if(elements[leftIndex].compareTo(pivot) < 0){
                leftIndex++;
                continue;
            }
   
            for (; rightIndex >= leftIndex; rightIndex--) {
                if(elements[rightIndex].compareTo(pivot) < 0){
                    cache = elements[leftIndex];
                    elements[leftIndex] = elements[rightIndex];
                    elements[rightIndex] = cache;
                    rightIndex--;
                    break;
                }
            }
        }

        if (initialRightIndex - initialLeftIndex <= 1)
            return elements;

        if (leftIndex == initialLeftIndex) 
            leftIndex++;

        quickSort(initialLeftIndex, rightIndex, elements);
        quickSort(leftIndex, initialRightIndex, elements);
        
        return elements;
    }
}
