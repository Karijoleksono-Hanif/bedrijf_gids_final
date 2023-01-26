package service;


import configuration.JPAConfiguration;
import entity.Bedrijf;
import repository.BedrijfRepository;

import java.util.List;



public class BedrijfService {

    private final BedrijfRepository bedrijfRepository;
    public BedrijfService() {
        this.bedrijfRepository = new BedrijfRepository(JPAConfiguration.getEntityManager());
    }
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
