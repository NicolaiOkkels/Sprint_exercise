package com.example.demo.model;

import java.util.Date;

public class Media {

    private long mediaId;
    private String mediaName;
    private Date mediaDate;

    public Media(long mediaId, String mediaName, Date mediaDate) {
        this.mediaId = mediaId;
        this.mediaName = mediaName;
        this.mediaDate = mediaDate;

    }

    public long getMediaId() {
        return mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public Date getMediaDate() {
        return mediaDate;
    }
}
