package com.moodanalyzer;

public class MoodAnalyser {
    public String analyseMood(String message) {
       try {
           if ( message.contains("I am Any Mood") )
               return "HAPPY";
           else
               return "SAD";
       }
       catch (NullPointerException e){
           return "HAPPY";
       }

    }
}
