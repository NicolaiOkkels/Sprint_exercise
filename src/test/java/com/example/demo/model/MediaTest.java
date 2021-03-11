package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MediaTest {

    Media getMedia(){
        Media m = new Media();
        m.setMediaId(1);
        m.setMediaName("Title");
        m.setMediaDate(new Date (2021,11,3));

        return m;
    }

    @Test
    void testEquals(){
    }

}