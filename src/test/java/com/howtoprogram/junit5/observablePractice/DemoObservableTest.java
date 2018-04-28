package com.howtoprogram.junit5.observablePractice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.ObservablePractice.DemoObservables;

public class DemoObservableTest {
    int[] arrNumbers= {1,5,10,20};

    @Test
    @DisplayName("shouldGreaterThanTen")
    public void shouldGreaterThanTen() {
        int[] listExpected={20};
        int[] result=DemoObservables.getGreaterThanTen(arrNumbers);
        assertArrayEquals(listExpected,result);
    }

    @Test
    @DisplayName("shouldDuplicate")
    public void shouldDuplicate() {
        int[] listExpected= {2,10,20,40};
       int[] result=DemoObservables.getDuplicateNumbers(arrNumbers);
        assertArrayEquals(listExpected, result);

    }

    

    @Test
    @DisplayName("shouldHGreaterThanTenEmpty")
    public void shouldValidateEmptyArrayDuplicate() {  
        int[] listExpected= {};
        int[] testList= {};
        int[] result=DemoObservables.getDuplicateNumbers(testList);
        assertArrayEquals(listExpected, result);

    }
  
    @Test
    @DisplayName("shouldValidateDuplicateEmpty")
    public void shouldValidateEmptyArrayGreaterThanTen() {
        int[] listExpected= {};
        int[] testList= {};
        int[] result=DemoObservables.getGreaterThanTen(testList);
        assertArrayEquals(listExpected, result);

    }


}
















