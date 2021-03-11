package com.example.demo.repository;

import com.example.demo.model.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaRepository {

    @Autowired
    org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;

    public List<Media> readAll(){
        String sql = "SELECT * FROM media";
        RowMapper<Media> rowMapper = new BeanPropertyRowMapper<>(Media.class);
        return JdbcTemplate.query(sql, rowMapper);
    }

    public void create(Media media){
        String sql = "INSERT INTO media (mediaId, mediaName, mediaDate) VALUES (?, ?, ?)";
        JdbcTemplate.update(sql, media.getMediaId(), media.getMediaName(), media.getMediaDate());
    }

    public void delete(long mediaId){
        String sql = "DELETE FROM media WHERE mediaId=?";
        JdbcTemplate.update(sql, mediaId);
    }

    public Media read(long mediaId){
        String sql = "SELECT * FROM media WHERE mediaId=?";
        RowMapper<Media> rowMapper = new BeanPropertyRowMapper<>(Media.class);
        return JdbcTemplate.queryForObject(sql, rowMapper, mediaId);
    }

    public void update(Media media){
        String sql = "UPDATE media SET mediaName=?, mediaDate=? WHERE mediaId=?";
        JdbcTemplate.update(sql, media.getMediaName(), media.getMediaDate(), media.getMediaId());
    }
}