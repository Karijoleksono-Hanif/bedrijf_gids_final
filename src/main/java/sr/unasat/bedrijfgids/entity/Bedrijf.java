package sr.unasat.bedrijfgids.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.util.HashSet;
import java.util.Set;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bedrijf {

    @Id
    @GeneratedValue
    private Long id;
    private String bedrijf_naam;
    private String filiaal;
    private String filiaal_adress;
    private String email_adress;
    private String telefoon_nummer;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MediaFiles mediaFiles;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Entiteit entiteit;

    @JsonIgnore
    @ManyToMany(mappedBy = "bedrijfs", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Set<Industrie> industries = new HashSet<>();

    @Override
    public String toString() {
        return "Bedrijven{" +
                "Id=" + id +
                ", bedrijfNaam='" + bedrijf_naam + '\'' +
                ", emailAdress=" + email_adress +
                '}';
    }

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

    public String getFiliaal() {
        return filiaal;
    }

    public void setFiliaal(String filiaal) {
        this.filiaal = filiaal;
    }

    public String getFiliaal_adress() {
        return filiaal_adress;
    }

    public void setFiliaal_adress(String filiaal_adress) {
        this.filiaal_adress = filiaal_adress;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public String getTelefoon_nummer() {
        return telefoon_nummer;
    }

    public void setTelefoon_nummer(String telefoon_nummer) {
        this.telefoon_nummer = telefoon_nummer;
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
