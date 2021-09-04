package com.java;

public class News extends Observer{

	   private NewsAgency subject;

	public News(NewsAgency subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( subject.getNews() ); 
	   }
}
