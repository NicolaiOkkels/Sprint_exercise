package com.example.demo.model;

public class Media {

    private long mediaId;
    private String mediaName;

    public Media(long mediaId, String mediaName) {
        this.mediaId = mediaId;
        this.mediaName = mediaName;
    }

    public long getMediaId() {
        return mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }
}
