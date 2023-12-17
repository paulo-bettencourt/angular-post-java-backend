package org.angularpost.services;

import org.angularpost.model.VideoInfo;
import org.angularpost.repository.VideoInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosService {

    @Autowired
    private VideoInfoRepository videoInfoRepository;

    public List<VideoInfo> getAllEntities() {
        return videoInfoRepository.findAll();
    }

    // Other methods...
}