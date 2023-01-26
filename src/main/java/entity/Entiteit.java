package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Entiteit {

    @Id
    @GeneratedValue
    private Long id;
    private String typeZaak;

    public Long getId(long id) {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTypeZaak() {
        return typeZaak;
    }
    public void setTypeZaak(String typeZaak) {
        this.typeZaak = typeZaak;
    }
}
