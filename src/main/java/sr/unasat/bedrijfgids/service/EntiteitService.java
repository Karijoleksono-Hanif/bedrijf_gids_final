package sr.unasat.bedrijfgids.service;


import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Entiteit;
import sr.unasat.bedrijfgids.dao.EntiteitRepository;

public class EntiteitService {
    private EntiteitRepository entiteitRepository;

    public EntiteitService() {
        this.entiteitRepository = new EntiteitRepository(JPAConfiguration.getEntityManager());
    }
    public Entiteit createEntiteit(Entiteit entiteit){
        return entiteitRepository.createEntiteit(entiteit);
    }
}
