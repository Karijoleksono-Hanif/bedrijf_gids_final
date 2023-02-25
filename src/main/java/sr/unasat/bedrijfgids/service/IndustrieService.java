package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Industrie;
import sr.unasat.bedrijfgids.dao.IndustrieRepository;

public class IndustrieService {
    private IndustrieRepository industrieRepository;

    public IndustrieService() {
        this.industrieRepository = new IndustrieRepository(JPAConfiguration.getEntityManager());
    }
    public Industrie createIndustrie(Industrie industrie){
        return industrieRepository.createIndustrie(industrie);
    }
}
