package org.angularpost.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VideoInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String link;

    public VideoInfo(Long id, String link) {
        this.id = id;
        this.link = link;
    }

    public VideoInfo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
