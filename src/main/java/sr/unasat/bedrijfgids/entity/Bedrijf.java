package sr.unasat.bedrijfgids.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Bedrijf {

    @Id
    @GeneratedValue
    private Long id;
    private String bedrijf_naam;
    private String email_adress;

    @OneToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MediaFiles mediaFiles;

    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Entiteit entiteit;

    @ManyToMany(mappedBy = "bedrijfs", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Set<Industrie> industries = new HashSet<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBedrijf_naam() {
        return bedrijf_naam;
    }
    public void setBedrijf_naam(String bedrijf_naam) {
        this.bedrijf_naam = bedrijf_naam;
    }
    public String getEmail_adress() {
        return email_adress;
    }
    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }
    public MediaFiles getMediaFiles() {
        return mediaFiles;
    }
    public void setMediaFiles(MediaFiles mediaFiles) {
        this.mediaFiles = mediaFiles;
    }
    public Entiteit getEntiteit() {
        return entiteit;
    }
    public void setEntiteit(Entiteit entiteit) {
        this.entiteit = entiteit;
    }
    public Set<Industrie> getIndustries() {
        return industries;
    }
    public void setIndustries(Set<Industrie> industries) {
        this.industries = industries;
    }
}
