package com.rest.feedback;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class FeedbackService {
    public Boolean isValidFeedback(String feedBack) {
        //Read the objectionable words from db
        Set<String> objectionableWords = new HashSet<>();
        objectionableWords.add("objword1");
        objectionableWords.add("objword2");
        objectionableWords.add("objword3");
        objectionableWords.add("objword4");
        objectionableWords.add("objword5");

        String []words = feedBack.split(" ");
        for(String word : words){
            if(objectionableWords.contains(word))
                return false;
        }
        return  true;
    }
}
