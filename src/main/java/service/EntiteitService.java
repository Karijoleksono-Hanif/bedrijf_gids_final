package service;


import configuration.JPAConfiguration;
import entity.Entiteit;
import repository.EntiteitRepository;

public class EntiteitService {
    private EntiteitRepository entiteitRepository;

    public EntiteitService() {
        this.entiteitRepository = new EntiteitRepository(JPAConfiguration.getEntityManager());
    }
    public Entiteit createEntiteit(Entiteit entiteit){
        return entiteitRepository.createEntiteit(entiteit);
    }
}
