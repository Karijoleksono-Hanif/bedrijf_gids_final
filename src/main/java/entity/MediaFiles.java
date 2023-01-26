package entity;

import jakarta.persistence.*;

@Entity
public class MediaFiles {

    @Id
    @GeneratedValue
    private Long id;
    private String fotos;
    private String videos;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFotos() {
        return fotos;
    }
    public void setFotos(String fotos) {
        this.fotos = fotos;
    }
    public String getVideos() {
        return videos;
    }
    public void setVideos(String videos) {
        this.videos = videos;
    }

}
