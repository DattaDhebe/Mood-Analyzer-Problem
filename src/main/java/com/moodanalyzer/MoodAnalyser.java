package com.moodanalyzer;

public class MoodAnalyser {
    public String analyseMood(String message) {

        if ( message.contains("Any Mood") )
            return "HAPPY";
        else
            return "SAD";

    }
}
