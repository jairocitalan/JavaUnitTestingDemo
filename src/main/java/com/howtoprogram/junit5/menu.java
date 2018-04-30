package com.howtoprogram.junit5;
import java.util.ArrayList;

import com.howtoprogram.junit5.ObservablePractice.FizzBuzz;
import com.howtoprogram.junit5.Services.IElectionImpl;

import io.reactivex.Observable;

public class menu {

	@SuppressWarnings("unchecked")
	public static void main() {
		/*IElectionImpl election= new IElectionImpl();
		
		String cadidatoName=election.getCadidateNameByParty("Axity");
		
		int numOfVotes=election.getNumberOfVotesByParty("Axity");
		
		System.out.print(String.format("%s %i",cadidatoName, numOfVotes));*/
		ArrayList<String> listColection =new ArrayList<String>();
		FizzBuzz fb= new FizzBuzz();
		listColection= fb.fizzBuzz(15);
		
		Observable.fromArray(listColection).subscribe(x -> System.out.println(x));
		
	}
}
