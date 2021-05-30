package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
	public  static String analyseMood(String message) {
		if(message.equalsIgnoreCase("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}
}
