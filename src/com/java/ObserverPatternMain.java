package com.java;

public class ObserverPatternMain {
	   public static void main(String[] args) {
	      NewsAgency subject = new NewsAgency();

	      new News(subject);

	      System.out.println("First News");	
	      subject.setNews("Lewis University Orientation");
	      System.out.println("Second News");	
	      subject.setNews("Please do not come ..!!");
	   }
	}