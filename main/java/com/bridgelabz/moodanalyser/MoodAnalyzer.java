package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
	public String message;
	public MoodAnalyzer( ) {

	}

	public MoodAnalyzer (String message) {
		super();
		this.message=message;
	}

	public String analyseMood() throws MoodAnalyzerException {
		try {
			if(message.contains("SAD"))   {
				return "SAD";
			}
			else if(message.contains("Any")) {
				return "HAPPY";
			}
			else
				return "HAPPY";	
		}catch (NullPointerException ae) {
			throw new MoodAnalyzerException("Invalid Mood! Please provide valid mood ");
		}

	}

}
