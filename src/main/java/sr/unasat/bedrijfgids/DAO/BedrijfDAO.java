package sr.unasat.bedrijfgids.DAO;

import sr.unasat.bedrijfgids.entity.Bedrijf;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class BedrijfDAO {
    private EntityManager entityManager;

    public BedrijfDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Bedrijf> retrieveBedrijfList() {
        List<Bedrijf> bedrijfList = new ArrayList<>();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            String jpql = "select b from Bedrijf b";
            TypedQuery<Bedrijf> query = entityManager.createQuery(jpql, Bedrijf.class);
            bedrijfList = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return bedrijfList;
    }

}
