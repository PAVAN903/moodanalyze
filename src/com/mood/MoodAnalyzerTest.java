package com.mood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void test() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood="HAPPY";
		String actual=moodAnalyzer.Moodanalyze(mood);
		assertEquals("HAPPY",actual);
	}

}
