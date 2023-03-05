package sr.unasat.bedrijfgids.repositoryDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import sr.unasat.bedrijfgids.entity.Bedrijf;

import java.util.List;

import static sr.unasat.bedrijfgids.configuration.JPAConfiguration.entityManager;

public class BedrijvenRepository {

    List<Bedrijf> bedrijven;

    public BedrijvenRepository(EntityManager entityManager) {
    }

    public List<Bedrijf> getBedrijven(){
        String query = "select b from Bedrijf b";
        TypedQuery<Bedrijf> typedQuery = entityManager.createQuery(query, Bedrijf.class);
        List<Bedrijf> b = typedQuery.getResultList();
        return b;
    }

}
