package com.howtoprogram.junit5.ObservablePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import io.reactivex.Flowable;

public class DemoObservables2 {

	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
		ArrayList<Integer> resultList=new ArrayList<>();
		Flowable.
		fromArray(arrNumbers).
		filter(x -> x > 10).
		toList().
		subscribe(x -> {

            resultList.addAll(x);
          
        });
		
		return resultList.stream().toArray(Integer[]::new);
	}

}
