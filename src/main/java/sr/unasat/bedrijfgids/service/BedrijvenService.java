package sr.unasat.bedrijfgids.service;


import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijfRepository;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijvenRepository;

import java.util.List;

public class BedrijvenService {

    private final BedrijvenRepository bedrijvenRepository;
    public BedrijvenService() {
        this.bedrijvenRepository = new BedrijvenRepository(JPAConfiguration.getEntityManager());
    }
    public List<Bedrijf> getBedrijven() {
        return bedrijvenRepository.getBedrijven();
    }



}


