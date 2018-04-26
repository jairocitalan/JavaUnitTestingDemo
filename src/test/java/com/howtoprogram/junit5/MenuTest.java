package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.howtoprogram.junit5.Services.ElectionMock;
import com.howtoprogram.junit5.Services.IElection;
import com.howtoprogram.junit5.Services.IElectionImpl;

public class MenuTest {
	
		@Test
		public void getNameByPartyTest() {
			IElection election=new ElectionMock();
			
			String cadidatoName=election.getCadidateNameByParty("Axity");
			
			int numOfVotes=election.getNumberOfVotesByParty("Axity");
			
			assertEquals("Elmer Homero", cadidatoName);
			assertEquals(10, numOfVotes);
		}
		
		@Test
		public void getNameByPartyTestMockito() {
			IElection election= mock(IElectionImpl.class);
			
			when(election.getCadidateNameByParty("otra cosa")).thenReturn("Arturo");
			when(election.getNumberOfVotesByParty("")).thenReturn(0);
			
			String cadidatoName=election.getCadidateNameByParty("otra cosa");
			
			int numOfVotes=election.getNumberOfVotesByParty("");
			
			assertEquals("Arturo", cadidatoName);
			assertEquals(0, numOfVotes);
		}

		

		
	}

















