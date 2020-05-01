package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenSadMessage_ShouldReturnSAD() throws MoodAnalyseException {

        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMood_SouldReturnHAPPY() throws MoodAnalyseException {
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }

//    @Test
//    public void givenNullMood_ShouldReturnHAPPY() throws MoodAnalyseException {
//
//        String mood = moodAnalyser.analyseMood(null);
//        Assert.assertEquals("HAPPY", mood);
//
//    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void givenEmptyMood_ShouldThrowCustomMessage() throws MoodAnalyseException {

        thrown.expect(MoodAnalyseException.class);
        thrown.expectMessage("should not be empty");
        moodAnalyser.analyseMood(null);



    }




}
