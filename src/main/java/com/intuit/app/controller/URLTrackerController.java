package com.intuit.app.controller;


import com.intuit.app.service.URLTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class URLTrackerController {

    @Autowired
    URLTracker urlTracker;


    @PostMapping("/postURL")
    public String postAllUrls(@RequestParam Map<String, String> queryParameters, Map<String, Object> model) {

        return urlTracker.postAllUrls(queryParameters.get("url"));


    }

    @GetMapping("/top3Urls")
    public List<com.intuit.app.model.URLTracker> top3Urls(@RequestParam Map<String, String> queryParameters, Map<String, Object> model) {

        return urlTracker.top3Urls();


    }

}
