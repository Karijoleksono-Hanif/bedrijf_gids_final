package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Industrie {

    @Id
    @GeneratedValue
    private Long id;
    private String industrieNaam;

    @ManyToMany(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(
            name = "Bedrijf_Industrie",
            joinColumns = @JoinColumn(name = "Bedrijf_id"),
            inverseJoinColumns = @JoinColumn(name = "Inustrie_id")
    )

    protected Set<Bedrijf> bedrijfs = new HashSet<Bedrijf>();
    public Set<Bedrijf> getBedrijfs() {
        return bedrijfs;
    }
    public void setBedrijfs(Set<Bedrijf> bedrijfs) {
        this.bedrijfs = bedrijfs;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIndustrieNaam() {
        return industrieNaam;
    }
    public void setIndustrieNaam(String industrieNaam) {
        this.industrieNaam = industrieNaam;
    }


}
