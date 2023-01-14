package com.mood;

public class MoodAnalyzer {
	String analyzerMood(String mood) {
		
		if (mood.contains("SAD"))
			return "SAD";
		try {
			if (mood.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e) {
		   return "HAPPY";
	}}}
	


