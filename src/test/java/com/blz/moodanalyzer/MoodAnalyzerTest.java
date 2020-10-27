package com.blz.moodanalyzer;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

public class MoodAnalyzerTest {

	//UC1
	@Test
	public void givenMessage_WhenSad_ShowReturnedSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood  = moodAnalyzer.analyseMood("Sad Mood");
		assertEquals("SAD",mood);
		
	}
	@Test
	public void givenMessage_WhenNotSad_ShowReturnedHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood  = moodAnalyzer.analyseMood("Happy Mood");
		assertEquals("HAPPY",mood);
		
	}
	//UC2
	@Test
	public void givingMessage_Null_HaldlingNullPointerException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		try {
			//String mood  = moodAnalyzer.analyseMood(null);
			assertEquals("HAPPY",moodAnalyzer.analyseMood(null));
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e + " "+ e.getMessage());
		}
		
		
	}

}
