package com.mood;

public class MoodAnalyzer {
	
	private String mood;

	
	MoodAnalyzer(){}
		
		
   MoodAnalyzer(String mood){
	   this.mood=mood;
   }
    String Moodanalyze(String moodCase) {
	
      if (mood.contains("SAD"))
			return "SAD";
		
		else
			return "HAPPY";
	}
	}


