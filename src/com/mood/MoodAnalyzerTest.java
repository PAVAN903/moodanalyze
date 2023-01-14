package com.mood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void test() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood="NULL";
		String actual=moodAnalyzer.analyzerMood(mood);
		assertEquals("SAD",actual);
	}

}
