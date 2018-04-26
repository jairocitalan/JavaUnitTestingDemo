package com.howtoprogram.junit5.Services;

public class ElectionMock implements IElection{

	@Override
	public String getCadidateNameByParty(String party) {
		return "Elmer Homero";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		return 10;
	}

}
