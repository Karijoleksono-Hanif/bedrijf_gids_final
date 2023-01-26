package repository;

import entity.MediaFiles;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class MediaFilesRepository {
    private EntityManager entityManager;

    public  MediaFilesRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public MediaFiles createMediaFiles(MediaFiles mediaFiles) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(mediaFiles);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return mediaFiles;
    }
    public List<MediaFiles> readMediaFiles() {
        String query = "select m from MediaFiles m";
        TypedQuery<MediaFiles> typedQuery = entityManager.createQuery(query, MediaFiles.class);
        List<MediaFiles> m = typedQuery.getResultList();
        return m;
    }

    public boolean  deleteMediaFiles(long id) {
        try {
            entityManager.getTransaction().begin();
            MediaFiles m = entityManager.find(MediaFiles.class, id);
            entityManager.remove(m);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return false;
    }
}
