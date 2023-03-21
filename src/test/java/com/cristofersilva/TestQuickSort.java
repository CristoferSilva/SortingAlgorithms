package com.cristofersilva;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;
import com.cristofersilva.src.interfaces.ISortingAlgorithms;
import com.cristofersilva.src.QuickSort;

public class TestQuickSort {
    private ISortingAlgorithms<Integer> quickSort;
    @Before
    public void initQuickSortAlgorithm() {
        this.quickSort = new QuickSort<Integer>();
    }
    @Test
    public void testOrderingAnArray1() {
        Integer[] arrayToOrder = {4,2,8,7,1,5,3,6};
        Integer[] arrayOrdered = {1,2,3,4,5,6,7,8};
        Integer[] quickSortArray = quickSort.sort(arrayToOrder);
        assertArrayEquals(arrayOrdered, quickSortArray);
    }
    @Test
    public void testOrderingAnArray2() {
        Integer[] arrayToOrder = {2,6,5,4,3,8,7,1,0}; 
        Integer[] arrayOrdered = {0,1,2,3,4,5,6,7,8};
        Integer[] quickSortArray = quickSort.sort(arrayToOrder);
        assertArrayEquals(arrayOrdered, quickSortArray);
    }
    @Test
    public void testOrderingAnArray3() {
        Integer[] arrayToOrder = {4,2,8,-1,1,5,3,6,-9,-85};
        Integer[] arrayOrdered = {-85,-9,-1,1,2,3,4,5,6,8};
        Integer[] quickSortArray = quickSort.sort(arrayToOrder);
        assertArrayEquals(arrayOrdered, quickSortArray);
    }
}
