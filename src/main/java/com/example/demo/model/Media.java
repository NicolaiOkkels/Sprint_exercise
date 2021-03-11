package com.example.demo.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Media {

    private long mediaId;
    private String mediaName;
    private Date mediaDate;


    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public void setMediaDate(Date mediaDate) {
        this.mediaDate = mediaDate;
    }

    public long getMediaId() {
        return mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public Date getMediaDate() {
        return getMediaDate();
    }
}
