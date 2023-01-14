package com.mood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mood");
		String mood=sc.nextLine();
		String moodCase=mood.toUpperCase();
		System.out.println(moodAnalyzer.analyzerMood(moodCase));

	}

}
