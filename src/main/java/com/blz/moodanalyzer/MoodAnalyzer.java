package com.blz.moodanalyzer;

public class MoodAnalyzer{

	//UC_R
	String message;
	public MoodAnalyzer() {
		super();
	}
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}
	public String analyseMood(String message) {
			if(message.contains("Sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
	}
	public String analyseMoodAgain() throws MoodAnalyzerCustomException {
		try {
			if(message.contains("Sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}catch(Exception e) {
			throw new MoodAnalyzerCustomException("Please enter proper message");
		}
			
	}
}
