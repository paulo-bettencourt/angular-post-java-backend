package org.angularpost.controllers;

import org.angularpost.model.VideoInfo;
import org.angularpost.model.VideoInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class VideosController {
    VideoInfo[] videos = new VideoInfo[]{
            new VideoInfo(123L, "https://www.youtube.com/embed/hsUxJjY-PRg"),
            new VideoInfo(123L, "https://www.youtube.com/embed/hsUxJjY-PRg"),
            new VideoInfo(123L, "https://www.youtube.com/embed/hsUxJjY-PRg")
    };

    @Autowired
    private VideoInfoRepository videoInfoRepository;

    @GetMapping("/videos")
    public Iterable<VideoInfo> getVideos() {
        // Save videos to the database
        videoInfoRepository.saveAll(List.of(videos));

        // Retrieve videos from the database
        return videoInfoRepository.findAll();
    }
}