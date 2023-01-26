package service;

import configuration.JPAConfiguration;
import entity.Filialen;
import repository.FilialenRepository;


public class FilialenService {
    private FilialenRepository filialenRepository;

    public FilialenService() {
        this.filialenRepository = new FilialenRepository(JPAConfiguration.getEntityManager());
    }
    public Filialen createFilialen(Filialen filialen){
        return filialenRepository.createFilialen(filialen);
    }
}
