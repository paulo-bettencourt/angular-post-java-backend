package org.angularpost.controllers;

import org.angularpost.model.VideoInfo;
import org.angularpost.repository.VideoInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class VideosController {
    VideoInfo[] videos = new VideoInfo[]{
            new VideoInfo(123L, "New template syntax flow", "Angular's new template flow syntax enhances development by introducing streamlined constructs. With features like conditional expressions, developers can elegantly handle dynamic content rendering. The introduction of the nullish coalescing operator simplifies default values assignment. Template expressions have evolved, enabling developers to write concise and expressive code. These enhancements contribute to a more efficient and readable Angular codebase, empowering developers to create dynamic and responsive applications with greater ease and clarity.", "https://www.youtube.com/embed/hsUxJjY-PRg"),
            new VideoInfo(123L, "State Management and RxJS Interop", "State management and RxJS interop play a crucial role in modern web development. Efficient state management is essential for maintaining application data, ensuring consistency, and facilitating seamless user experiences. Integrating RxJS, a powerful reactive programming library, enhances state management by enabling asynchronous event handling and streamlining data flow. Through observables and operators, developers can orchestrate complex state changes, manage side effects, and synchronize application components.", "https://www.youtube.com/embed/R4Ff2bPiWh4"),
            new VideoInfo(123L, "Angular's Renaissance", "Angular's Renaissance marks a transformative era in the framework's evolution. With advancements in performance, Angular embraces incremental compilation for faster startup and smaller bundles. The introduction of Ivy, a next-generation rendering engine, enhances developer experience, reduces bundle sizes, and facilitates better tree-shakability. Improved diagnostics, stricter type checking, and enhanced debugging tools empower developers to create robust applications. Angular's Renaissance underscores a commitment to innovation.", "https://www.youtube.com/embed/d0daPe9q35w"),
    };

    @Autowired
    private VideoInfoRepository videoInfoRepository;

    @GetMapping("/videos")
    public Iterable<VideoInfo> getVideos() {
        // TODO: CHANGE THIS METHOD BECAUSE IT IS OVERRIDING THE DB EVERY TIME IT RUNS
        // Save videos to the database
        videoInfoRepository.saveAll(List.of(videos));

        // Retrieve videos from the database
        return videoInfoRepository.findAll();
    }

    @PostMapping("/videos")
    public VideoInfo postVideo(@RequestBody VideoInfo video) {
        return videoInfoRepository.saveAndFlush(video);
    }

    @DeleteMapping("/videos/{id}")
    public ResponseEntity deleteVideo(@PathVariable(name = "id") Long id) {
        videoInfoRepository.deleteById(id);

        // Return a custom response message
        String responseMessage = "OK";
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
}