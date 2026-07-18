package com.aquaroute.model;

public class Feed {
    //Creating entry fields
    private String id;
    private String sourceType;
    private message;
    private timeStamp;

    //Constructor
    public Feed(String id, String sourceType, String message, String timeStamp){
        this.id = id;
        this.sourceType = sourceType;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    //Getters
    public String getId() {return id;}
    public String getSourceType() {return sourceType;}
    public String getMessage() {return message;}
    public String getTimeStamp() {return timeStamp;}
}