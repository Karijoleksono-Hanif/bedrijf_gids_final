package sr.unasat.bedrijfgids.repositoryDAO;

import sr.unasat.bedrijfgids.entity.Entiteit;
import jakarta.persistence.EntityManager;

public class EntiteitRepository {

    private EntityManager entityManager;

    public EntiteitRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Entiteit createEntiteit(Entiteit entiteit) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entiteit);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return entiteit;
    }
}



