package com.rest.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    @Autowired
    FeedbackService feedbackService;

    @GetMapping("/hello-world")
    @ResponseBody
    public Boolean sayHello(@RequestParam(name="feedback", required=false, defaultValue="") String feedback) {
        return feedbackService.isValidFeedback(feedback);
    }
}
