package sr.unasat.bedrijfgids.service;


import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijfRepository;

import java.util.List;

public class BedrijfService {

    private final BedrijfRepository bedrijfRepository;
    public BedrijfService() {
        this.bedrijfRepository = new BedrijfRepository(JPAConfig.getEntityManager());
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
