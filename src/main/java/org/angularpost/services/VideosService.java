package org.angularpost.services;

import org.angularpost.model.PostsInfo;
import org.angularpost.repository.PostsInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosService {

    @Autowired
    private PostsInfoRepository postsInfoRepository;

    public List<PostsInfo> getAllEntities() {
        return postsInfoRepository.findAll();
    }

}