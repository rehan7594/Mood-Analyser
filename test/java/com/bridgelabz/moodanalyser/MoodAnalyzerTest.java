package com.bridgelabz.moodanalyser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

	@Test
	public void testAnalyseMood_Shouldreturn_Happy( ) throws MoodAnalyzerException {
		String message="I am in happy Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("HAPPY", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_Sad( ) throws MoodAnalyzerException {
		String message="I am in SAD Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("SAD", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_happy( ) throws MoodAnalyzerException {
		String message="I am in Any Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("HAPPY", mood);	

	}

	@Test
	public void givenAnalyzeMood_Shouldreturn_MoodAnalyserException() throws MoodAnalyzerException {
		String message =null;
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		try {
			String mood=moodAnalyzer.analyseMood(); 
			assertEquals("HAPPY", mood);
		}
		catch (MoodAnalyzerException ae) {
			ae.printStackTrace();
		} 
	}

}
