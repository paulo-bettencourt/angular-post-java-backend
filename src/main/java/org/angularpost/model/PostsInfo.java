package org.angularpost.model;
import jakarta.persistence.*;

@Entity
public class PostsInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String link;

    public PostsInfo() {}

    public PostsInfo(Long id, String title, String description, String link) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description= description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
