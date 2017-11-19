package com.intuit.app.model;


public class URLTracker {
    int id;
    String url;
    int counter;

    public URLTracker(int id, String url, int count) {
        this.id = id;
        this.url = url;
        this.counter = count;
    }

    public  URLTracker(){

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }



}
