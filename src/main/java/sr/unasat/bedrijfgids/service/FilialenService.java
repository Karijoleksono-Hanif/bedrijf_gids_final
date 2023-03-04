package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Filialen;
import sr.unasat.bedrijfgids.repositoryDAO.FilialenRepository;


public class FilialenService {
    private FilialenRepository filialenRepository;

    public FilialenService() {
        this.filialenRepository = new FilialenRepository(JPAConfiguration.getEntityManager());
    }
    public Filialen createFilialen(Filialen filialen){
        return filialenRepository.createFilialen(filialen);
    }
}
