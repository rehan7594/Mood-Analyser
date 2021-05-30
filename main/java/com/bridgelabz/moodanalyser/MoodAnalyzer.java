package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
	private String message;
	public MoodAnalyzer( ) {

	}

	public MoodAnalyzer (String message) {
		this.message=message;
	}

	public  static String analyseMood(String message) {
		if(message.toUpperCase().contains("SAD"))   {
			return "SAD";
		}
		else if(message.toUpperCase().contains("Any")) {
			return "HAPPY";
		}
		else
			return "HAPPY";	
	}
}
