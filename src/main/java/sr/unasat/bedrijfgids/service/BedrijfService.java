package sr.unasat.bedrijfgids.service;

import jakarta.persistence.EntityManager;
import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.dao.BedrijfRepository;
import sr.unasat.bedrijfgids.entity.Bedrijf;

import java.util.List;



public class BedrijfService {


    private BedrijfRepository bedrijfRepository = new BedrijfRepository();
    private EntityManager entityManager = JPAConfiguration.getEntityManager();


    public List<Bedrijf> readBedrijven() {
        return bedrijfRepository.readBedrijven();
    }
    public Bedrijf createBedrijf(Bedrijf bedrijf) {
        return bedrijfRepository.createBedrijf(bedrijf);
    }
    public Bedrijf updateBedrijf(Bedrijf bedrijf) {
        return bedrijfRepository.updateBedrijf(bedrijf);
    }
    public boolean deleteBedrijf(long id) {return bedrijfRepository.deleteBedrijf(id);}
}
