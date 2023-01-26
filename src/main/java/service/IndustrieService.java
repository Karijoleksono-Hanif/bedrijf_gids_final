package service;

import configuration.JPAConfiguration;
import entity.Industrie;
import repository.IndustrieRepository;

public class IndustrieService {
    private IndustrieRepository industrieRepository;

    public IndustrieService() {
        this.industrieRepository = new IndustrieRepository(JPAConfiguration.getEntityManager());
    }
    public Industrie createIndustrie(Industrie industrie){
        return industrieRepository.createIndustrie(industrie);
    }
}
