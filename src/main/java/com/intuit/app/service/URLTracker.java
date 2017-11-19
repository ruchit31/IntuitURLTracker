package com.intuit.app.service;

import com.intuit.app.repository.URLTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Intermediate class for connecting controller and repository.
 * can be sued for adding some extra logic
 */
@Service
public class URLTracker {

    @Autowired
    URLTrackerRepository urlTrackerRepository;



    public String postAllUrls(String url){
       return  urlTrackerRepository.postAllUrls(url);
    }

    public List<com.intuit.app.model.URLTracker> top3Urls(){
        return  urlTrackerRepository.top3Urls();
    }


}
