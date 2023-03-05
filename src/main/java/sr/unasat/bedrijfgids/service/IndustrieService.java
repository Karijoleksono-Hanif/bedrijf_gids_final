package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.entity.Industrie;
import sr.unasat.bedrijfgids.repositoryDAO.IndustrieRepository;

public class IndustrieService {
    private IndustrieRepository industrieRepository;

    public IndustrieService() {
        this.industrieRepository = new IndustrieRepository(JPAConfig.getEntityManager());
    }
    public Industrie createIndustrie(Industrie industrie){
        return industrieRepository.createIndustrie(industrie);
    }
}
