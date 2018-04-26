package com.howtoprogram.junit5;
import com.howtoprogram.junit5.Services.IElectionImpl;

public class menu {

	public static void main() {
		IElectionImpl election= new IElectionImpl();
		
		String cadidatoName=election.getCadidateNameByParty("Axity");
		
		int numOfVotes=election.getNumberOfVotesByParty("Axity");
		
		System.out.print(String.format(cadidatoName, numOfVotes));
	}
}
