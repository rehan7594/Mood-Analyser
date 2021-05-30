package com.bridgelabz.moodanalyser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

	@Test
	public void testAnalyseMood_Shouldreturn_Happy( ) {
		String message="I am in happy Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("HAPPY", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_Sad( ) {
		String message="I am in SAD Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("SAD", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_happy( ) {
		String message="I am in Any Mood";
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();
		assertEquals("HAPPY", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldthrow_nullPointerException() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(); 
		moodAnalyzer.analyseMood();     
	}

	@Test
	public void testAnalyseMood_Shouldthrow_NullPointerException() {
		String message=null;
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(message); 
		String mood=moodAnalyzer.analyseMood();  
		assertEquals("HAPPY", mood);
	}

}
