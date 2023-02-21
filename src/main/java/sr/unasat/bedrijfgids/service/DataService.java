package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.entity.MediaFiles;

import java.util.List;

public class DataService {

    public static void readDataBedrijf(){
        BedrijfService bedrijfService = new BedrijfService();
        List<Bedrijf> b =bedrijfService.readBedrijven();
        System.out.println(
                "+------------------+------------------------+"
        );
        b.forEach( bedrijf ->
                System.out.format( "| Bedrijf ID           : " + bedrijf.getId() +"\n" +
                                   "| Bedrijf Naam         : " + bedrijf.getBedrijf_naam() +"\n" +
                                   "| Bedrijf Email adress : " + bedrijf.getEmail_adress() + "\n\n"
                ));
        System.out.println("+------------------+------------------------+");
    }

    public static void readDataMediaFiles(){
        MediaFilesService mediaFilesService = new MediaFilesService();
        List<MediaFiles> m = mediaFilesService.readMediaFiles();
        System.out.println(
                "+------------------+------------------------+"
        );
        m.forEach( mediaFiles ->
                System.out.format(
                        "| Media ID             : " + mediaFiles.getId() +"\n" +
                        "| Foto                 : " + mediaFiles.getFotos() +"\n" +
                        "| Video                : " + mediaFiles.getVideos() + "\n\n"
                ));
        System.out.println("+------------------+------------------------+");
    }

    public static void updateBedrijf(){
        BedrijfService  bedrijfService = new BedrijfService();
        Bedrijf bedrijf = new Bedrijf();
        bedrijf.setId(1L);
        bedrijf.setBedrijf_naam("HANIF - UPDATED !!!");
        bedrijf.setEmail_adress("HANIF@hanif.com - UPDATED !!!");
        bedrijfService.updateBedrijf(bedrijf);
    }

    public static void deleteBedrijf(){
        BedrijfService bedrijfService = new BedrijfService();
        bedrijfService.deleteBedrijf(1L);
    }
    public static void deleteMediaFiles(){
        MediaFilesService mediaFilesService = new MediaFilesService();
        mediaFilesService.deleteMediaFiles(1L);
    }
}
