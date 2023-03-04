package sr.unasat.bedrijfgids.repositoryDAO;

import jakarta.persistence.EntityTransaction;
import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BedrijfRepository {
    private EntityManager entityManager = JPAConfiguration.getEntityManager();
    private EntityTransaction transaction = entityManager.getTransaction();



    private EntityManager entityManagerPersistence;

    public BedrijfRepository(EntityManager entityManager) {
    }

    public Bedrijf createBedrijf(Bedrijf bedrijf) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(bedrijf);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return bedrijf;
    }

    public List<Bedrijf> readBedrijven() {
        String query = "select b from Bedrijf b";
        TypedQuery<Bedrijf> typedQuery = entityManager.createQuery(query, Bedrijf.class);
        List<Bedrijf> b = typedQuery.getResultList();
        return b;
    }

    public Bedrijf updateBedrijf(Bedrijf bedrijf) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Bedrijf.class, bedrijf.getId());
            entityManager.merge(bedrijf);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bedrijf;
    }

    public boolean  deleteBedrijf(long id) {
        try {
            entityManager.getTransaction().begin();
            Bedrijf b = entityManager.find(Bedrijf.class, id);
            entityManager.remove(b);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return false;
    }

}



