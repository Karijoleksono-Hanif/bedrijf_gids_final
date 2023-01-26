package service;

import configuration.JPAConfiguration;
import entity.MediaFiles;
import repository.MediaFilesRepository;

import java.util.List;

public class MediaFilesService {
    private MediaFilesRepository mediaFilesRepository;

    public MediaFilesService() {this.mediaFilesRepository = new MediaFilesRepository(JPAConfiguration.getEntityManager());
    }
    public MediaFiles createMediaFiles(MediaFiles mediaFiles){return mediaFilesRepository.createMediaFiles(mediaFiles);
    }
    public List<MediaFiles> readMediaFiles() {
        return mediaFilesRepository.readMediaFiles();
    }
    public boolean deleteMediaFiles(long id){return mediaFilesRepository.deleteMediaFiles(id);}
}
