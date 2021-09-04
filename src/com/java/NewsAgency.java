package com.java;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private String news;

   public String getNews() {
      return news;
   }

   public void setNews(String news) {
      this.news = news;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }
	
}

