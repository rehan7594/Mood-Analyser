package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
	public String message;
	public MoodAnalyzer( ) {

	}

	public MoodAnalyzer (String message) {
		super();
		this.message=message;
	}

	public String analyseMood() {
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
			return "HAPPY";
		}

	}

}
