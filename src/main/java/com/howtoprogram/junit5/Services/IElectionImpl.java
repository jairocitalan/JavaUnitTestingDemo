package com.howtoprogram.junit5.Services;

public class IElectionImpl implements IElection{

	@Override
	public String getCadidateNameByParty(String party) {
		if(party.equals("Axity")) {
			return "Urbano";
		}
		
		return "Elmer Homero";
	}  

	@Override
	public int getNumberOfVotesByParty(String party) {
		if(party.equals("Axity")) {
			return 100;
		}  
		
		return 50;
	}

}
