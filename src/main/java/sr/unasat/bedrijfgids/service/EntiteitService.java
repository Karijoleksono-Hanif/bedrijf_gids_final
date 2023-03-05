package sr.unasat.bedrijfgids.service;


import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.entity.Entiteit;
import sr.unasat.bedrijfgids.repositoryDAO.EntiteitRepository;

public class EntiteitService {
    private EntiteitRepository entiteitRepository;

    public EntiteitService() {
        this.entiteitRepository = new EntiteitRepository(JPAConfig.getEntityManager());
    }
    public Entiteit createEntiteit(Entiteit entiteit){
        return entiteitRepository.createEntiteit(entiteit);
    }
}
