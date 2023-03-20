package sr.unasat.bedrijfgids.dto;



public class BedrijfDTO {
    private Long id;
    private String bedrijf_naam;
    private String filiaal;
    private String filiaal_adress;
    private String email_adress;
    private String telefoon_nummer;

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
}
