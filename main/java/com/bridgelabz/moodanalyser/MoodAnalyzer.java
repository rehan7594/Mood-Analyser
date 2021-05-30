package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
	public  static String analyseMood(String message) {
		if(message.toUpperCase().contains("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}
}
