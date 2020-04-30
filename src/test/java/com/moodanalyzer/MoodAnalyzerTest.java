package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenAnalyseMood_ShouldReturnSAD(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnalyseMood_SouldReturnHAPPY(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", result);
    }

}
