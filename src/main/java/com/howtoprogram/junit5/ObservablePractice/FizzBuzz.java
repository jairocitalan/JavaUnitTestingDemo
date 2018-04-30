package com.howtoprogram.junit5.ObservablePractice;

import java.util.ArrayList;
import java.util.Arrays;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class FizzBuzz {

	public ArrayList<String> fizzBuzz(int rango_ini,int rango_end) {
		ArrayList<String> listColect = new ArrayList<String>() ;
		
	    final ConnectableObservable<Integer> range = Observable.range(rango_ini, rango_end).publish();
		
		final Observable<String> out = Observable.merge(
				range.filter((i) -> i % 15 == 0).map((i) -> "FIZZBUZZ"),
                range.filter((i) -> i % 15 != 0 && i % 3 == 0).map((i) -> "FIZZ"),
                range.filter((i) -> i % 15 != 0 && i % 5 == 0).map((i) -> "BUZZ"),
                range.filter((i) -> i %3 != 0 && i % 5 != 0).map((i) -> Integer.toString(i)));
	            
                
                out.subscribe((str) -> listColect.add(str));
                range.connect();
		
                return listColect;
		 
	                         }
	
                    }
