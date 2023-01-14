package com.mood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mood");
		String mood=sc.nextLine();
		String moodCase=mood.toUpperCase();
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
	
		try {
			System.out.println(moodAnalyzer.analyzerMood(moodCase));
		} catch (CustomException e) {
			System.out.println("this is customexception");
			System.out.println("HAPPY");
			
		}
		
			
		}
	}

