package sr.unasat.bedrijfgids.repositoryDAO;

import jakarta.persistence.EntityManager;
import sr.unasat.bedrijfgids.entity.Industrie;



public class IndustrieRepository {

    private EntityManager entityManager;

    public IndustrieRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Industrie createIndustrie(Industrie industrie) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(industrie);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return industrie;
    }
}
