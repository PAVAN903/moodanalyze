package com.mood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void test() throws CustomException {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood="HAPPY";
		String actual=moodAnalyzer.analyzerMood(mood);
		assertEquals("NULL",actual);
	}

}
