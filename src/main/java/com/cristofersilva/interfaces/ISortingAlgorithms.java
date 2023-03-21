package com.cristofersilva.interfaces;

public interface ISortingAlgorithms<T extends Comparable<T>>{
    public T[] sort(T[] elements);
}
