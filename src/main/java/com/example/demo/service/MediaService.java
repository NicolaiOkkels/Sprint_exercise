package com.example.demo.service;

import com.example.demo.model.Media;
import com.example.demo.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MediaService {

    @Autowired
    MediaRepository mediaRepository;

    public void create(Media media){ mediaRepository.create(media); }

    public void delete(long mediaId){ mediaRepository.delete(mediaId); }

    public void update(Media media){
        mediaRepository.update(media);
    }

    public List<Media> readAll(){
        List<Media> mediaList = new ArrayList<>();
        for (Media media : mediaRepository.readAll()) {
            mediaList.add(media);
        }
        return mediaList;
    }

    public Media read(long mediaId){
        return mediaRepository.read(mediaId);
    }

}