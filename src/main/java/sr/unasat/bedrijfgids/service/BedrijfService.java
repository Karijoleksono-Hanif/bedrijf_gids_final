package sr.unasat.bedrijfgids.service;


import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.dto.BedrijfDTO;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijfRepository;

import java.util.List;

public class BedrijfService {



    private  BedrijfRepository bedrijfRepository;
    public BedrijfService() {
        this.bedrijfRepository = new BedrijfRepository(JPAConfig.getEntityManager());
    }
    public List<Bedrijf> readBedrijven() {
        return bedrijfRepository.readBedrijven();
    }
    public Bedrijf createBedrijf(Bedrijf bedrijf) {
        return bedrijfRepository.createBedrijf(bedrijf);
    }

    public Bedrijf createBedrijfData (BedrijfDTO bedrijfDTO){

        Bedrijf bedrijf = new Bedrijf();

        try {
            bedrijf.setBedrijf_naam(bedrijfDTO.getBedrijf_naam());
            bedrijf.setFiliaal(bedrijfDTO.getFiliaal());
            bedrijf.setFiliaal_adress(bedrijfDTO.getFiliaal_adress());
            bedrijf.setEmail_adress(bedrijfDTO.getEmail_adress());
            bedrijf.setTelefoon_nummer(bedrijfDTO.getTelefoon_nummer());

            bedrijfRepository.insertBedrijf(bedrijf);


            return bedrijf;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return bedrijf;
    }


    public Bedrijf updateBedrijf(Bedrijf bedrijf) {
        return bedrijfRepository.updateBedrijf(bedrijf);
    }
    public boolean deleteBedrijf(long id) {return bedrijfRepository.deleteBedrijf(id);}
}
