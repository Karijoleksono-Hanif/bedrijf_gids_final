package sr.unasat.bedrijfgids.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import jakarta.persistence.*;

@Entity
public class Filialen {

    @Id
    @GeneratedValue
    private Long id;
    private String telefoonNummer;
    private String adress;
    private String district;
    private String openingstijden;

    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Bedrijf bedrijf;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTelefoonNummer() {
        return telefoonNummer;
    }
    public void setTelefoonNummer(String  telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getOpeningstijden() {
        return openingstijden;
    }
    public void setOpeningstijden(String openingstijden) {
        this.openingstijden = openingstijden;
    }
    public Bedrijf getBedrijf() {
        return bedrijf;
    }
    public void setBedrijf(Bedrijf bedrijf) {
        this.bedrijf = bedrijf;
    }
}
