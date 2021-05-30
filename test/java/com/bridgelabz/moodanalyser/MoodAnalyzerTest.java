package com.bridgelabz.moodanalyser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

	@Test
	public void testAnalyseMood_Shouldreturn_Happy( ) {
		String message="I am in happy Mood";
		String mood=MoodAnalyzer.analyseMood(message);
		assertEquals("HAPPY", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_Sad( ) {
		String message="I am in SAD Mood";
		String mood=MoodAnalyzer.analyseMood(message);
		assertEquals("SAD", mood);	

	}

	@Test
	public void testAnalyseMood_Shouldreturn_happy( ) {
		String message="I am in Any Mood";
		String mood=MoodAnalyzer.analyseMood(message);
		assertEquals("HAPPY", mood);	

	}
}
