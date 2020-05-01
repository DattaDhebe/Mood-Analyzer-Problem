package com.moodanalyzer;



public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyseException {
    try {
        if (message.contains("I am in Any Mood"))
            return "HAPPY";
        else
            return "SAD";
    } catch (NullPointerException e) {
        throw new MoodAnalyseException("should not be empty");

    }

    }


}
