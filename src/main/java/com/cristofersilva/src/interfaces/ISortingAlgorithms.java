package com.cristofersilva.src.interfaces;

public interface ISortingAlgorithms<T extends Comparable<T>>{
    public T[] sort(T[] elements);
}
