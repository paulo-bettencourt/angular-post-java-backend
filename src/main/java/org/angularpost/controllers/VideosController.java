package org.angularpost.controllers;

import org.angularpost.model.VideoInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class VideosController {
    VideoInfo[] videos = {
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF"),
            new VideoInfo(123, "https://www.youtube.com/embed/v4HkkjXmEMM?si=-EhqAthFjE4-AAhF")
    };

    @GetMapping("/videos")
    public VideoInfo[] getVideos() {
        return videos;
    }
}