package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.entity.MediaFiles;
import sr.unasat.bedrijfgids.repositoryDAO.MediaFilesRepository;

import java.util.List;

public class MediaFilesService {
    private MediaFilesRepository mediaFilesRepository;

    public MediaFilesService() {this.mediaFilesRepository = new MediaFilesRepository(JPAConfig.getEntityManager());
    }
    public MediaFiles createMediaFiles(MediaFiles mediaFiles){return mediaFilesRepository.createMediaFiles(mediaFiles);
    }
    public List<MediaFiles> readMediaFiles() {
        return mediaFilesRepository.readMediaFiles();
    }
    public boolean deleteMediaFiles(long id){return mediaFilesRepository.deleteMediaFiles(id);}
}
